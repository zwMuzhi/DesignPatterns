package com.muzhi.strategy;

/**
 * <h3>DesignPatterns</h3>
 * <p>绿头鸭</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:10
 **/
public class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
