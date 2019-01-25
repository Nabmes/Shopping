package net.nab.shoppingB.dao;

import net.nab.shoppingB.dto.Address;
import net.nab.shoppingB.dto.Cart;
import net.nab.shoppingB.dto.User;

public interface UserDAO {
	
	//add an user
	boolean addUser (User user);
	
	//add an address
	boolean addAddress(Address address);
	
	//add a cart
	boolean addCart(Cart cart);	
	
}
