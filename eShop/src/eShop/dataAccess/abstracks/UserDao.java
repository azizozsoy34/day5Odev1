package eShop.dataAccess.abstracks;

import eShop.entities.concretes.User;

public interface UserDao {
    
	void add(User user);
    boolean emailCheck(User user);
    boolean loginByCheck(String email, String password);
	
}
