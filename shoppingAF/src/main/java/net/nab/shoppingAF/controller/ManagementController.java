package net.nab.shoppingAF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.nab.shoppingB.dao.CategoryDAO;
import net.nab.shoppingB.dto.Category;
import net.nab.shoppingB.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView showManageProduct() {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageProducts", true);
		mv.addObject("title", "Manage Products");
		
		Product nProduct = new Product();
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		mv.addObject("product", nProduct);
		
		return mv;
	}
	
	//returning categories
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return categoryDAO.liste();
	}

}
