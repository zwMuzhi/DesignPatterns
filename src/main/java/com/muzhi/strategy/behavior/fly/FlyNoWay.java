package com.muzhi.strategy.behavior.fly;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-24 22:43
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
