package uol.compass.avaliacao.exercicio_3.model;

public class Emoticon {

    private String frase;
    private int divertido;
    private int chateado;

    public void setFrase(String frase) {
        this.frase = frase;
    }

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
