package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller seller);
	void update(Seller seller);
	Seller findById(Integer id);
	void delteById(Integer id);
	List<Seller> find();
	
}
