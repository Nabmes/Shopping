package net.nab.shoppingB.dao;

import java.util.List;

import net.nab.shoppingB.dto.Product;

public interface ProductDAO {

	List<Product> list();
	Product get(int productId);
	
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//business methodes
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> listLatestActiveProducts(int count);	
}
