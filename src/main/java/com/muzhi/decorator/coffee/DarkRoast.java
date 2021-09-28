package com.muzhi.decorator.coffee;

import com.muzhi.decorator.base.Beverage;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:14
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 15.00;
    }
}
