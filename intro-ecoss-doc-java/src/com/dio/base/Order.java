package com.dio.base;

import java.math.BigDecimal;

public class Order {

    private final String code;
    private final Double totalValue;

    public Order(String code, Double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee() {
        if (this.totalValue > 100) {
            return this.totalValue * 0.99;
        } else {
            return this.totalValue;
        }
    }

    @Override
    public String toString() {
        return "Order{Code:'" + code + "'}";
    }

}