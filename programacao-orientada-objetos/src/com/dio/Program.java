package com.dio;

import com.dio.heranca.Caminhao;
import com.dio.heranca.Carro;
import com.dio.heranca.Moto;
import com.dio.heranca.Veiculo;
import com.dio.porlimorfismo.ClasseFilha1;
import com.dio.porlimorfismo.ClasseFilha2;
import com.dio.porlimorfismo.ClasseMae;
import com.dio.repository.Calculadora;

public class Program {
    public static void main(String[] args) {

//        EXERCÍCIO 01
//        Carro carro1 = new Carro("Preta", "Honda Civiv", 40);
//        Carro carro2 = new Carro("Prata", "Jetta", 60);
//        Carro carro3 = new Carro("Vermelha", "Captiva", 120);
//
////        carro1.acelarar();
////        carro1.frear();
//
//        System.out.println("Modelo: " + carro1.getModelo());
//        System.out.println("Cor: " + carro1.getCor());
//        carro1.valorEnxerTanque(3.50);
//
//        System.out.println();
//        System.out.println("Modelo: " + carro2.getModelo());
//        System.out.println("Cor: " + carro2.getCor());
//        carro2.valorEnxerTanque(3.50);
//
//        System.out.println();
//        System.out.println("Modelo: " + carro3.getModelo());
//        System.out.println("Cor: " + carro3.getCor());
//        carro3.valorEnxerTanque(3.50);



//        EXERCÍCIO 02
//        Carro car = (Carro) new Veiculo();
//        Veiculo veic = new Carro();
//
//        Moto moto = (Moto) new Veiculo();
//        Veiculo veicu = new Moto();
//
//        Caminhao truck = (Caminhao) new Veiculo();
//        Veiculo veiculo = new Caminhao();
//
//        ClasseMae[] classMother = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
//
//        for (ClasseMae cs : classMother) {
//            cs.metodo1();
//        }
//
//        System.out.println();
//
//        for (ClasseMae cs : classMother) {
//            cs.metodo2();
//        }
//
//        System.out.println();
//
//        ClasseFilha2 classeFilha2 = new ClasseFilha2();
//        classeFilha2.metodo2();


//        EXERCÍCIO 03
        Calculadora calculadora = new Calculadora();
        calculadora.soma(2, 2);
        calculadora.substracao(5, 3);
        calculadora.multiplicacao(3, 3);
        calculadora.divisao(8, 2);
        calculadora.modulo(4, 2);
    }
}