package br.com.catolica.pb.Model;

public class Gato extends Animal implements Vocalizador {

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }

    public void pular() {
        System.out.println(nome + " está pulando.");
    }
}


