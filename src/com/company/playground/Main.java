package com.company.playground;

public class Main {


    public static void main(String[] args) {
        Window window = new Window();
        window.GUI();
        IO scn = new IO();
        System.out.println("Bem vindo ao jogo de estrategia do Joãozinho");
        System.out.print("Escreva aqui o seu nome: ");
        String playerName = scn.scanNextLine();
        System.out.println("Escolha uma arma.");

    }
}
