package com.muzhi.decorator.base;

/**
 * <h3>DesignPatterns</h3>
 * <p>饮料抽象类</p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:03
 **/
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    /**
     * 费用
     */
    public abstract double cost();

    /**
     * 获取描述
     * @return  描述
     */
    public String getDescription() {
        return description;
    }
}
