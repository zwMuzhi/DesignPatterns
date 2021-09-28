package com.muzhi.decorator.base;

/**
 * <h3>DesignPatterns</h3>
 * <p>调料</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:06
 **/
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
