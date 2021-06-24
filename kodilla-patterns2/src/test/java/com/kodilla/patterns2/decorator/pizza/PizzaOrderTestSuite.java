package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    void TestBasicPizzaOrder() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal cost = order.getCost();
        String desc = order.getDescription();
        //Then
        Assertions.assertEquals(new BigDecimal(15), cost);
        Assertions.assertEquals("You ordered pizza (tomato sauce + cheese)", desc);
    }

    @Test
    void TestBasicPizzaOrderSize() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MediumSizeDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String desc = order.getDescription();
        //Then
        Assertions.assertEquals(new BigDecimal(20), cost);
        Assertions.assertEquals("You ordered pizza (tomato sauce + cheese) medium size", desc);
    }
    @Test
    void TestClassicPizzaOrderLarge() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new LargeSizeDecorator(order);
        order = new HamDecorator(order);
        order = new MushroomDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String desc = order.getDescription();
        //Then
        Assertions.assertEquals(new BigDecimal(29), cost);
        Assertions.assertEquals("You ordered pizza (tomato sauce + cheese) large size + ham + mushroom", desc);
    }
    @Test
    void TestHawaiPizzaOrderMedium() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MediumSizeDecorator(order);
        order = new ChickenDecorator(order);
        order = new PineappleDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String desc= order.getDescription();
        //Then
        Assertions.assertEquals(new BigDecimal(25), cost);
        Assertions.assertEquals("You ordered pizza (tomato sauce + cheese) medium size + chicken + pineapple", desc);

    }
}
