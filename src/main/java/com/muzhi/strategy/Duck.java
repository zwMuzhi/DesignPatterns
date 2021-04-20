package com.muzhi.strategy;

import java.util.List;

/**
 * <h3>DesignPatterns</h3>
 * <p>鸭子</p>
 *
 * @author : zwmuzhi
 * @date : 2021-04-20 22:04
 **/
public class Duck {
    /**
     * 呱呱叫
     */
    public void quack(){
        System.out.println("呱呱叫");
    };

    /**
     * 游泳
     */
    public  void swin(){
        System.out.println("游泳");
    };

    /**
     * 外观
     */
    public void display(){
        System.out.println("外观");
    };


}
