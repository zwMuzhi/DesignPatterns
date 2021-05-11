package com.muzhi.strategy;

import com.muzhi.strategy.behavior.fly.FlyNoWay;
import com.muzhi.strategy.behavior.quack.Quack;

/**
 * <h3>DesignPatterns</h3>
 * <p>红头鸭</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:11
 **/
public class MiniDuckSimulator extends Duck{
    public MiniDuckSimulator() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
