package br.maua.dao;

import br.maua.model.Anime;
import br.maua.model.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe criada para conexão com o banco de dados "manga".
 */

public class MangaDAO implements DAO<Manga> {
    private Connection connection;
    private String DBconnectionString = "jdbc:sqlite:AnimeList.db";

    public MangaDAO() {
        try {
            connection = DriverManager.getConnection(DBconnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Método criado para coletar dados de todos os mangas cadastrados no banco de dados local, alocando tais informações em uma lista.
     *
     * @return ArrayList - mangas
     */

    @Override
    public List<Manga> getAll() {
        List<Manga> mangas = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM manga");
            while (result.next()) {
                Manga manga = new Manga(
                        result.getString("titulo"),
                        result.getString("url"),
                        result.getString("sinopse"),
                        result.getInt("capitulos"),
                        result.getInt("volumes"),
                        result.getString("tipo"),
                        result.getFloat("nota")
                );
                mangas.add(manga);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mangas;
    }

    /**
     * Método criado para inserir um novo manga no banco de dados local, recebendo tal manga como parâmetro.
     *
     * @param manga
     */

    @Override
    public void insert(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO manga (titulo, url, sinopse, capitulos, volumes,  tipo, nota) VALUES (?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, manga.getTitulo());
            preparedStatement.setString(2, manga.getUrl());
            preparedStatement.setString(3, manga.getSinopse());
            preparedStatement.setInt(4, manga.getCapitulos());
            preparedStatement.setInt(5, manga.getVolumes());
            preparedStatement.setString(6, manga.getTipo());
            preparedStatement.setFloat(7, manga.getNota());

            int retorno = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
