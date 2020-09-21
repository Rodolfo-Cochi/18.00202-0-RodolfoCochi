package br.maua.dao;

import java.util.List;

public interface DAO <T>{
    List<T> getAll();
    void insert(T t);
}
