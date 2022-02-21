package com.dio.base;

import java.util.Arrays;

public class OrderFor {

    private String code;
    private Integer totalValue;

    private String[] items = new String[10];

    public OrderFor() {
    }

    public OrderFor(String code, Integer totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItemsFor() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items.toString() + " " + i);
        }
    }

    @Override
    public String toString() {
        return "OrderFor{" +
                "code='" + code + '\'' +
                ", totalValue=" + totalValue +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
