package model.dao;

import java.util.List;

import model.entities.Vendedor;

public interface VendedorDao {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Vendedor id);
	Vendedor findById(Vendedor id);
	List<Vendedor> findAll();
}
