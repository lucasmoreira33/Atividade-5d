package br.com.catolica.pb.Model;

public class Arara extends Animal implements Vocalizador, Voador {

    public Arara(String nome, int idade, String cor) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Arara: Squawk!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }
}


