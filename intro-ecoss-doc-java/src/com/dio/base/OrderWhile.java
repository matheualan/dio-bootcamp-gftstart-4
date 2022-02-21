package com.dio.base;

public class OrderWhile {

    private String code;
    private Double totalValue;

    private String[] items = new String[10];

    public OrderWhile() {
    }

    public OrderWhile(String code, Double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItemsWhile() {
        int i = 0;
        while (i < items.length) {
            System.out.println(items + " " + i);
            i++;
        }
    }

}
