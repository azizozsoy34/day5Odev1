package eShop.business.abstracks;

import eShop.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
}
