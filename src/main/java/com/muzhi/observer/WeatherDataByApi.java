package com.muzhi.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 15:54
 **/
public class WeatherDataByApi extends Observable {

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

    /**
     * 测量值改变
     */
    public void measurementsChanged() {
        // 设置改变
        setChanged();
        notifyObservers();
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

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
