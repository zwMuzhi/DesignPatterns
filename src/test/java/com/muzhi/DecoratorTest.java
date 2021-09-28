package com.muzhi;

import com.muzhi.decorator.coffee.DarkRoast;
import com.muzhi.decorator.coffee.Espresso;
import com.muzhi.decorator.base.Beverage;
import com.muzhi.decorator.coffee.HouseBlend;
import com.muzhi.decorator.condiment.Milk;
import com.muzhi.decorator.condiment.Mocha;
import com.muzhi.decorator.condiment.Soy;
import com.muzhi.strategy.TestEnum;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-13 17:28
 **/
public class DecoratorTest {

    public static void main(String[] args) {
        //StarbuzzCoffee();
        TestEnum.ARTICLE.addId(3);
        TestEnum.ARTICLE.addId(4);
        TestEnum.ARTICLE.addId(5);
        TestEnum.ARTICLE.addId(6);
        System.out.println(TestEnum.ARTICLE.getIdList());
        StarbuzzCoffee();
    }


    private static void  StarbuzzCoffee(){
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + "$" + beverage.cost());
//
//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Soy(beverage2);
//        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
//
//        Beverage beverage3 = new HouseBlend();
//        beverage3 = new Soy(beverage3);
//        beverage3 = new Mocha(beverage3);
//        beverage3 = new Milk(beverage3);
//        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
        TestEnum.ARTICLE.addId(5);
        TestEnum.ARTICLE.addId(6);
        System.out.println(TestEnum.ARTICLE.getIdList());
    }
}
