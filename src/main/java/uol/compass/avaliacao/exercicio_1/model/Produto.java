package uol.compass.avaliacao.exercicio_1.model;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }
}
