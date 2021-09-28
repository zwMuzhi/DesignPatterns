package com.muzhi.decorator.condiment;

import com.muzhi.decorator.base.Beverage;
import com.muzhi.decorator.base.CondimentDecorator;

/**
 * <h3>DesignPatterns</h3>
 * <p>豆浆</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:23
 **/
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
