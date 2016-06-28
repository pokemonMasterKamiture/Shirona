package com.mycompany.myapp;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> extends Serializable {
	public List<T> getAll();

	public void add(FormModel fm);
}
