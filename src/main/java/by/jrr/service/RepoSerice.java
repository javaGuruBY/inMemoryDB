package by.jrr.service;

import by.jrr.bean.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RepoSerice<T extends Entity> implements Repository<T> {

    private Map<String, T> storage;

    public RepoSerice(Map<String, T> storage) {
        this.storage = storage;
    }

    public void save(T t) {
        storage.put(t.getId(), t);
    }

    public List<T> findAll() {
        return new ArrayList<T>(storage.values());
    }
}
