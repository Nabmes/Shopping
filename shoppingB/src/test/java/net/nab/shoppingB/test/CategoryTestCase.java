package net.nab.shoppingB.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nab.shoppingB.dto.Category;
import net.nab.shoppingB.dao.CategoryDAO;


public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.nab.shoppingB");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
@Test
public void testCRUDCategory() {
	//add operation
	category = new Category();
	
	category.setName("MobileTest");
	category.setDescription("This is some description for Mobile!");
	category.setImageURL("CAT_105.png");
	
	assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
	
	category = new Category();
	
	category.setName("LaptopTest");
	category.setDescription("This is some description for Mob!");
	category.setImageURL("CAT_105.png");
	
	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	
	//fetching and updating the category
		category = categoryDAO.get(2);
		
		category.setName("TelevisionTest");
		category.setDescription("This is some description for TV!");
		category.setImageURL("CAT_10.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.update(category));
		
		//delete category
		
		category = categoryDAO.get(2);

		
		assertEquals("Successfully deleted a single category inside the table!",true,categoryDAO.delete(category));
		
		assertEquals("Successfully fetch a single category from the table!",1,categoryDAO.liste().size());
		
		
}
	
}
