package com.dio;

import com.dio.classes.Carro;

public class Program {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Preta", "Honda Civiv", 40);
        Carro carro2 = new Carro("Prata", "Jetta", 60);
        Carro carro3 = new Carro("Vermelha", "Captiva", 120);

//        carro1.acelarar();
//        carro1.frear();

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        carro1.valorEnxerTanque(3.50);

        System.out.println();
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        carro2.valorEnxerTanque(3.50);

        System.out.println();
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Cor: " + carro3.getCor());
        carro3.valorEnxerTanque(3.50);

    }
}