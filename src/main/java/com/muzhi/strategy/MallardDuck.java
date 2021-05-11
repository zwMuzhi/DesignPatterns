package com.muzhi.strategy;

import com.muzhi.strategy.behavior.fly.FlyWithWings;
import com.muzhi.strategy.behavior.quack.Quack;

/**
 * <h3>DesignPatterns</h3>
 * <p>绿头鸭</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:10
 **/
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
