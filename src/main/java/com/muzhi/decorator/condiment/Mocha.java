package com.muzhi.decorator.condiment;

import com.muzhi.decorator.base.Beverage;
import com.muzhi.decorator.base.CondimentDecorator;

/**
 * <h3>DesignPatterns</h3>
 * <p>摩卡</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:17
 **/
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
