package uol.compass.avaliacao.exercicio_2.controller;

import uol.compass.avaliacao.exercicio_2.dao.FilmeDAO;
import uol.compass.avaliacao.exercicio_2.factory.ConnectionFactory;
import uol.compass.avaliacao.exercicio_2.model.Filme;

import java.sql.Connection;
import java.util.List;

// Camada intermediária para as requisições
public class FilmeController {

    FilmeDAO filmeDAO;

    public FilmeController() {
        Connection connection = new ConnectionFactory().getConnection();
        filmeDAO = new FilmeDAO(connection);
    }

    public List<Filme> getList() {
        return this.filmeDAO.getList();
    }

    public void create(Filme filme) {
        this.filmeDAO.create(filme);
    }
}
