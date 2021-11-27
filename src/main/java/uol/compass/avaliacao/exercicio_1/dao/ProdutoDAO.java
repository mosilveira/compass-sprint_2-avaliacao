package uol.compass.avaliacao.exercicio_1.dao;

import uol.compass.avaliacao.exercicio_1.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para listar todos os produtos cadastrados
    public List<Produto> getList() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT id, nome, descricao, quantidade, preco FROM produtos";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getDouble(5));
                    produtos.add(produto);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
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

    // Método para remover um produto a partir de um id
    public void remove(Integer id) {
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, id);

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
