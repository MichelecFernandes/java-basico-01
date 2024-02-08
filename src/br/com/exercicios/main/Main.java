package br.com.exercicios.main;

import br.com.exercicios.idade.Idade;

public class Main {
    public static void main(String[] args) {
        Idade idadeDeclarada = new Idade(15);
        idadeDeclarada.exibirIdade();
        System.out.println("Resultao 1: " + idadeDeclarada.somaMultiplicaIdade(5,2) + " . ");
        System.out.println("Resultao 2: " + idadeDeclarada.subtraiIdade(5) + " . ");
        idadeDeclarada.verificaIdade(20);

    }

}