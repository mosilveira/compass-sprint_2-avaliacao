package uol.compass.avaliacao.exercicio_1.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// Classe responsável por abrir uma conexão com o banco de dados
public class ConnectionFactory {

    // Interface para o pool de conexões
    private DataSource dataSource;

    public ConnectionFactory() {

        // Implementação do pool de conexões
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("123456");

        this.dataSource = comboPooledDataSource;
    }

    // Método para recuperar a conexão
    public Connection getConnection() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}