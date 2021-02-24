package br.maua.dao;

import br.maua.model.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe criada para conexão com o banco de dados "anime".
 */

public class AnimeDAO implements DAO<Anime> {
    private Connection connection;
    private String DBconnectionString = "jdbc:sqlite:AnimeList.db";

    public AnimeDAO() {
        try {
            connection = DriverManager.getConnection(DBconnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Método criado para coletar dados de todos os animes cadastrados no banco de dados local, alocando tais informações em uma lista de animes.
     *
     * @return ArrayList - animes
     */

    @Override
    public List<Anime> getAll() {
        List<Anime> animes = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM anime");
            while (result.next()) {
                Anime anime = new Anime(
                        result.getString("titulo"),
                        result.getString("url"),
                        result.getString("sinopse"),
                        result.getInt("epsodios"),
                        result.getFloat("nota"),
                        result.getString("tipo")
                );
                animes.add(anime);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return animes;
    }

    /**
     * Método criado para inserir um novo anime no banco de dados local, recebendo tal anime como parâmetro.
     *
     * @param anime
     */

    @Override
    public void insert(Anime anime) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO anime (titulo, url, sinopse, epsodios, nota, tipo) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, anime.getTitulo());
            preparedStatement.setString(2, anime.getUrl());
            preparedStatement.setString(3, anime.getSinopse());
            preparedStatement.setInt(4, anime.getEpsodios());
            preparedStatement.setFloat(5, anime.getNota());
            preparedStatement.setString(6, anime.getTipo());
            //Executando
            int retorno = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
