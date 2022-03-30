package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao nosso BANCO DIO DIGITAL\n");

        Cliente cliente = new Cliente();
        cliente.setNome("Leon");

        Conta contaC = new ContaCorrente(cliente);
        Conta contaP = new ContaPoupanca(cliente);

        contaC.depositar(2500);
        contaC.depositar(2500);
        contaC.transferir(1000, contaP);


        contaC.imprimirExtrato();
        contaP.imprimirExtrato();


        System.out.println("Sua transação foi realizada com sucesso! Até breve!");
    }
}
