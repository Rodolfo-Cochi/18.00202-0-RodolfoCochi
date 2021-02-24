package br.maua.dao;

import java.util.List;

/**
 * Interface genérica utilizada para gerar os métodos que as classes AnimeDAO e MangaDAO terão que implementar.
 * @param <T>
 */
public interface DAO <T>{
    List<T> getAll();
    void insert(T t);
}
