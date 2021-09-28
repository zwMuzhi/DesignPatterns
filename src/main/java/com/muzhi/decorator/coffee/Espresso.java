package com.muzhi.decorator.coffee;

import com.muzhi.decorator.base.Beverage;

/**
 * <h3>DesignPatterns</h3>
 * <p>浓缩咖啡</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:11
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 10;
    }
}
