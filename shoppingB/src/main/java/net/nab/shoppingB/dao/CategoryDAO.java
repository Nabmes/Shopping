package net.nab.shoppingB.dao;

import java.util.List;

import net.nab.shoppingB.dto.Category;

public interface CategoryDAO {

	List<Category> liste();
	
	Category get(int id);
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
