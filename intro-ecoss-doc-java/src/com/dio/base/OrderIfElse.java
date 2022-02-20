package com.dio.base;

public class OrderIfElse {

    private final String code;
    private final Double totalValue;

    public OrderIfElse(String code, Double totalValue) {
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
