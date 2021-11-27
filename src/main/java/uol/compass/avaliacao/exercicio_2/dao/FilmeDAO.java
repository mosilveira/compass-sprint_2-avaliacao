package uol.compass.avaliacao.exercicio_2.dao;

import uol.compass.avaliacao.exercicio_1.model.Produto;
import uol.compass.avaliacao.exercicio_2.model.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    private Connection connection;

    public FilmeDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Filme> getList() {
        List<Filme> filmes = new ArrayList<>();
        String sql = "SELECT nome, descricao, ano FROM filmes";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Filme filme = new Filme(rst.getString(1), rst.getString(2), rst.getInt(3));
                    filmes.add(filme);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filmes;
    }

    public void create(Filme filme) {
        String sql = "INSERT INTO filmes (nome, descricao, ano) VALUES (?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome());
            pstm.setString(2, filme.getDescricao());
            pstm.setInt(3, filme.getAno());

            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
