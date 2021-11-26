package uol.compass.avaliacao.exercicio_1.dao;

import uol.compass.avaliacao.exercicio_1.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para salvar um cadastro no banco de dados
    public void create(Produto produto) {
        String sql = "INSERT INTO produtos (nome, descricao, quantidade, preco) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());

            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para atualizar um registro cadastrado
    public void update(Produto produto, Integer id) {
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, quantidade = ?, preco = ? WHERE id = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.setInt(5, id);

            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
