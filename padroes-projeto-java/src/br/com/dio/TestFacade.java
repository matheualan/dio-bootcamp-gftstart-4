package br.com.dio;

import br.com.dio.facade.Facade;

public class TestFacade {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "14801788");

    }
}
