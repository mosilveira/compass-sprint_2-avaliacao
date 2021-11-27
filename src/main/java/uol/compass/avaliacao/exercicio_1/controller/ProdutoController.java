package uol.compass.avaliacao.exercicio_1.controller;

import uol.compass.avaliacao.exercicio_1.dao.ProdutoDAO;
import uol.compass.avaliacao.exercicio_1.factory.ConnectionFactory;
import uol.compass.avaliacao.exercicio_1.model.Produto;

import java.sql.Connection;
import java.util.List;

// Camada intermediária para as requisições
public class ProdutoController {

    ProdutoDAO produtoDAO;

    public ProdutoController() {
        Connection connection = new ConnectionFactory().getConnection();
        this.produtoDAO = new ProdutoDAO(connection);
    }

    public List<Produto> getList() {
        return this.produtoDAO.getList();
    }

    public void create(Produto produto) {
        this.produtoDAO.create(produto);
    }

    public void remove(Integer id) {
        this.produtoDAO.remove(id);
    }

    public void update(Produto produto, Integer id) {
        this.produtoDAO.update(produto, id);
    }
}
