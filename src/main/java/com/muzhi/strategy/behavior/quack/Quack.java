package com.muzhi.strategy.behavior.quack;

/**
 * <h3>DesignPatterns</h3>
 * <p>鸭子呱呱叫</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-25 22:49
 **/
public class Quack implements QuackBehavior {

    @Override
    public void qucak() {
        System.out.println("鸭子呱呱叫");
    }
}
