package com.dio;

import com.dio.classes.Carro;

public class Program {
    public static void main(String[] args) {

        Carro carro = new Carro("Preta", "Honda Civiv", 40);

        carro.acelarar();
        carro.frear();

        carro.valorEnxerTanque(3.50);
        
    }
}