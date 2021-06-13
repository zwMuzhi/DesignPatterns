package com.muzhi.observer;

/**
 * <h3>DesignPatterns</h3>
 * <p>主题</p>
 *
 * @author : zwmuzhi
 * @date : 2021-05-11 23:41
 **/
public interface Subject {

    /**
     * 注册
     */
    void registerObserver(Observer observer);

    /**
     * 移除
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     */
    void notifyObserver();
}
