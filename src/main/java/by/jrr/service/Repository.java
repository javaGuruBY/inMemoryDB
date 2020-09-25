package by.jrr.service;

import by.jrr.bean.Entity;

import java.util.List;
import java.util.Map;

public interface Repository<T extends Entity> {
    //    CRUD
    void save(T t);
    List<T> findAll();
}
