package eShop;

import eShop.business.abstracks.UserService;
import eShop.business.concretes.UserManager;
import eShop.core.concretes.EmailValidatorManager;
import eShop.core.concretes.GoogleUserServiceAdapter;
import eShop.core.concretes.UserVerificationManager;
import eShop.dataAccess.concretes.InMemoryUserDao;
import eShop.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
        
		User user1 = new User("Aziz","Baskan","aziz@gmail.com","123456");
		
		UserService userService1 = new UserManager(new InMemoryUserDao(), new UserVerificationManager(), new EmailValidatorManager());
		
		
     
		userService1.register(user1);
		
		
		
		User user2 = new User("Engin","Demirog","engindemirog@gmail.com","121212");
		
		System.out.println("--------------------");
		
		UserService userService2 = new UserManager(new InMemoryUserDao(), new GoogleUserServiceAdapter(), new EmailValidatorManager());
		
		
		
		userService2.register(user2);
		
		System.out.println("--------------------");
		
		userService1.login("kayagizem2301@gmail.com", "123456738393020");
		
		System.out.println("--------------------");
		
        userService1.login("kayagizem2301@gmail.com", "123456");
        
        System.out.println("--------------------");
        
        userService2.login("engindemirog@gmail.com", "121212");

	}

}
