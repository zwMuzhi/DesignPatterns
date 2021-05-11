package com.muzhi.strategy.behavior.quack;

/**
 * <h3>DesignPatterns</h3>
 * <p>不会叫</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-25 22:49
 **/
public class MuteQuack implements QuackBehavior {

    @Override
    public void qucak() {
        System.out.println("我不会叫");
    }
}
