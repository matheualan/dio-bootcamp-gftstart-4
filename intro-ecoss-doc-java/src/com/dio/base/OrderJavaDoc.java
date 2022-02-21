package com.dio.base;

/**
 * @author Matheus Alan
 * @version 1.0.0
 * @see java.math.BigDecimal     'see' cria link para a classe especificada
 * @since Release 1.0.0
 */

public class OrderJavaDoc {

    private String code;
    private Double totalValue;

    /**
     * Construtor da classe
     * @param code          Código do pedido
     * @param totalValue    Valor total do pedido
     */
    public OrderJavaDoc(String code, Double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula taxas de imposto de acordo com o valor total do pedido para pedidos acima de $ 100
     * @return Valor total do pedido com as taxas calculadas
     * @throws RuntimeException lança essa exceção se o pedido for um valor negativo
     */
    public Double calculateFee() throws RuntimeException {
        if (this.totalValue < 0) throw new RuntimeException("O pedido não pode ter valor negativo");
        if (this.totalValue.compareTo(100.00) > 0) return this.totalValue * 0.99;
        return this.totalValue;
    }

}
