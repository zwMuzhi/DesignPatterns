package com.muzhi.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <h3>DesignPatterns</h3>
 * <p>布告板</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-05 22:04
 **/
public class CurrentConditionsDisplayByApi implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayByApi(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataByApi) {
            WeatherDataByApi weatherDataByApi = (WeatherDataByApi) o;
            this.temperature = weatherDataByApi.getTemperature();
            this.humidity = weatherDataByApi.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
