package uol.compass.avaliacao.exercicio_3;

import uol.compass.avaliacao.exercicio_3.model.Emoticon;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Emoticon emoticon = new Emoticon();

        String frase = sc.nextLine();

        emoticon.setFrase(frase);

        emoticon.contadorDeEmoticon();
        emoticon.mostrarResultado();

        sc.close();
    }
}
