package com.muzhi;

import com.muzhi.observer.CurrentConditionsDisplay;
import com.muzhi.observer.CurrentConditionsDisplayByApi;
import com.muzhi.observer.WeatherData;
import com.muzhi.observer.WeatherDataByApi;

import java.util.concurrent.TimeUnit;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-05 22:11
 **/
public class ObserverTest {
    public static void main(String[] args) {
        observerByApi();
    }


    public void  observerBySubject(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherData.setMeasurements(100,200,300);
    }

    public static void observerByApi(){
        WeatherDataByApi weatherDataByApi = new WeatherDataByApi();
        CurrentConditionsDisplayByApi currentConditionsDisplayByApi = new CurrentConditionsDisplayByApi(weatherDataByApi);
        weatherDataByApi.setMeasurements(10,20,30);
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherDataByApi.setMeasurements(100,200,300);

    }
}
