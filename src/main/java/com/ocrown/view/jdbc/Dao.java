package com.ocrown.view.jdbc;

import java.util.List;

public interface Dao<T> {
    public List<T> listT();
    public T getT(String id);
}
