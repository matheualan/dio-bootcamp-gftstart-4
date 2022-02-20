package com.dio;

import com.dio.base.Order;
import java.math.BigDecimal;

public class MyFirstProgram {

    public static void main(String[] args) {
        Order order = new Order("c123", 2.50);
        System.out.println(order);
    }

}
