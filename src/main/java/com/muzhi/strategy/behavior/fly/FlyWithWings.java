package com.muzhi.strategy.behavior.fly;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-24 22:41
 **/
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
