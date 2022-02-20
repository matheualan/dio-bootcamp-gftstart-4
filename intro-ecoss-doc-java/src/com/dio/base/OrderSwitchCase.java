package com.dio.base;

public class OrderSwitchCase {

    private final String code;
    private final Integer totalValue;

    public OrderSwitchCase(String code, Integer totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public Integer calculateFee() {
        switch (totalValue) {
            case 100:
                return totalValue * 2;
            case 200:
                return totalValue * 4;
            case 300:
                return totalValue * 6;
            default:
                return totalValue;
        }
    }

}
