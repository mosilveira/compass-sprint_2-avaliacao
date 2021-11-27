package uol.compass.avaliacao.exercicio_2.model;

public class Filme {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer ano;

    public Filme(String nome, String descricao, Integer ano) {
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ano=" + ano +
                '}';
    }
}
