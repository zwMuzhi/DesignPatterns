package com.muzhi.observer;

/**
 * <h3>DesignPatterns</h3>
 * <p>观察者</p>
 *
 * @author : zwmuzhi
 * @date : 2021-05-11 23:40
 **/
public interface Observer {
    /**
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temperature, float humidity, float pressure);
}
