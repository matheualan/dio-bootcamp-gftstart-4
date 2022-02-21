package com.dio.base;

public class OrderEnhancedFor {

    private String code;
    private Integer totalValue;

    private String[] items;

    public OrderEnhancedFor(String code, Integer totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItemsEnhancedFor() {
        for (String item : items) {
            System.out.println(item);
        }
    }
    
}
