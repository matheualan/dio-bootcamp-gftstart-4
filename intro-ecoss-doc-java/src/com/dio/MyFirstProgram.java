package com.dio;

import com.dio.base.Order;
import com.dio.base.OrderFor;
import com.dio.base.OrderWhile;

/**
 * Definir uma variável como 'final' obriga ela a ser inicializada e a classe não pode ter Construtor em branco
 */

public class MyFirstProgram {

    public static void main(String[] args) {
        var order = new Order("c123", 2.50);
        System.out.println(order);

        OrderFor orderFor = new OrderFor();
        var orderWhile = new OrderWhile();

        orderFor.printItemsFor();
        orderWhile.printItemsWhile();
    }

}
