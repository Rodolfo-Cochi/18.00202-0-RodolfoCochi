package br.maua.dao;

import br.maua.model.Anime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void insert(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO anime (titulo, url, sinopse, epsodios, nota, tipo) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, anime.getTitulo());
            preparedStatement.setString(2, anime.getUrl());
            preparedStatement.setString(3, anime.getSinopse());
            preparedStatement.setInt(4, anime.getEpsodios());
            preparedStatement.setFloat(5, anime.getNota());
            preparedStatement.setString(6, anime.getTipo());
            //Executando
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
