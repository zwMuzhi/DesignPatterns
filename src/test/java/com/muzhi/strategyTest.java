package com.muzhi;

import com.muzhi.strategy.MallardDuck;
import com.muzhi.strategy.RedheadDuck;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:23
 **/
public class strategyTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
    }
}
