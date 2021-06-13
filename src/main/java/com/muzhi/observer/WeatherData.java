package com.muzhi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>DesignPatterns</h3>
 * <p>天气数据</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-05 21:47
 **/
public class WeatherData implements Subject {

    private List<Observer> observers;

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 压强
     */
    private float pressure;


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 测量值改变
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 设置天气数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }
}
