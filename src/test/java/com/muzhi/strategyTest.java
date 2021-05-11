package com.muzhi;

import com.muzhi.strategy.Duck;
import com.muzhi.strategy.MallardDuck;
import com.muzhi.strategy.MiniDuckSimulator;
import com.muzhi.strategy.behavior.fly.FlyWithWings;


/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:23
 **/
public class strategyTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();


        System.out.println("-----------------");

        Duck miniDuckSimulator = new MiniDuckSimulator();
        miniDuckSimulator.display();
        miniDuckSimulator.performQuack();
        miniDuckSimulator.performFly();

        System.out.println("----模型鸭变身-----");
        miniDuckSimulator.setFlyBehavior(new FlyWithWings());
        miniDuckSimulator.performFly();
    }
}
