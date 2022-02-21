package com.dio.base;

public class OrderFor {

        private String code;
        private Integer totalValue;

        private String[] items;

        public OrderFor() {
        }

        public OrderFor(String code, Integer totalValue) {
            this.code = code;
            this.totalValue = totalValue;
        }

    public void printItemsFor() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items + " " + i);
        }
    }

}
