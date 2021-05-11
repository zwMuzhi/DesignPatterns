package com.muzhi.strategy;

import com.muzhi.strategy.behavior.fly.FlyBehavior;
import com.muzhi.strategy.behavior.quack.QuackBehavior;

import java.util.Date;
import java.util.List;

/**
 * <h3>DesignPatterns</h3>
 * <p>鸭子</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:04
 **/
public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    /**
     * 叫
     */
    public void performQuack() {
        quackBehavior.qucak();
    }

    /**
     * 飞行
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 游泳
     */
    public void swin() {
        System.out.println("游泳");
    }

    /**
     * 外观
     */
    public void display() {
        System.out.println("外观");
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
