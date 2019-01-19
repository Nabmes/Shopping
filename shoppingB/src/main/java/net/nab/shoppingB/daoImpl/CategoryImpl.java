package net.nab.shoppingB.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.nab.shoppingB.dao.CategoryDAO;
import net.nab.shoppingB.dto.Category;

@Repository("categoryDAO")
public class CategoryImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is description for tv");
		category.setImageURL("cat1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is description for mobile");
		category.setImageURL("cat2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is description for Laptop");
		category.setImageURL("cat3.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> liste() {
		// TODO Auto-generated method stub
 
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
