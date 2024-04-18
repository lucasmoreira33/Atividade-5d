package br.com.catolica.pb.Model;

public class Peixe extends Animal implements Nadador {

    public Peixe(String nome, int idade, String tipo) {
        super(nome, idade);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}


