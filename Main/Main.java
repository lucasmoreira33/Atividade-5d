package br.com.catolica.pb.Main;

import br.com.catolica.pb.Model.Arara;
import br.com.catolica.pb.Model.Gato;
import br.com.catolica.pb.Model.Peixe;
import br.com.catolica.pb.Model.Voador;

public class Main {
    public static void main(String[] args) {
        Arara arara = new Arara("Ararara", 5, "Azul");
        Gato gato = new Gato("Gatinho", 3, "Preto");
        Peixe peixe = new Peixe("Peixinho", 1, "Dourado");

        arara.emitirSom();
        ((Voador)arara).voar();
        gato.emitirSom();
        gato.pular();
        peixe.nadar();
    }
}




