package uol.compass.avaliacao.exercicio_1.model;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private Double preco;

    public Produto(Integer id, String nome, String descricao, Integer quantidade, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

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

    @Override
    public String toString() {
        return "Produto: " +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco;
    }
}
