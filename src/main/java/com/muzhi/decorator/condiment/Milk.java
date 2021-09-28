package com.muzhi.decorator.condiment;

import com.muzhi.decorator.base.Beverage;
import com.muzhi.decorator.base.CondimentDecorator;

/**
 * <h3>DesignPatterns</h3>
 * <p>牛奶</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:23
 **/
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3.00 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
