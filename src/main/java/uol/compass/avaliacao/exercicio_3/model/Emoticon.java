package uol.compass.avaliacao.exercicio_3.model;

public class Emoticon {

    private String frase;
    private int divertido;
    private int chateado;

    public void setFrase(String frase) {
        this.frase = frase;
    }

    // Método para identificar os emoticons e contar as ocorrências de cada um
    public void contadorDeEmoticon() {
        for (int i = 0; i < this.frase.length(); i++) {
            if (this.frase.charAt(i) == ':') {
                String keyWord = this.frase.substring(i, i+3);
                if (keyWord.equals(":-)")) {
                    divertido++;
                }
                else if (keyWord.equals(":-(")) {
                    chateado++;
                }
            }
        }
    }

    // Método para verificar e mostrar o resultado da contagem
    public void mostrarResultado() {
        if (divertido > chateado) {
            System.out.println("divertido");
        }
        else if (divertido == (chateado)) {
            System.out.println("neutro");
        } else {
            System.out.println("chateado");;
        }
    }
}