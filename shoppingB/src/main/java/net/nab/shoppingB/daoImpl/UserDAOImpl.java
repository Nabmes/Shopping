package net.nab.shoppingB.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.nab.shoppingB.dao.UserDAO;
import net.nab.shoppingB.dto.Address;
import net.nab.shoppingB.dto.Cart;
import net.nab.shoppingB.dto.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired SessionFactory sessionFactory;
	
	@Override
	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

}
