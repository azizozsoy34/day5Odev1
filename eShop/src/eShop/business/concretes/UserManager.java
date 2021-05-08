package eShop.business.concretes;

import eShop.business.abstracks.UserService;
import eShop.core.abstracks.ValidatorService;
import eShop.core.abstracks.VerificationService;
import eShop.dataAccess.abstracks.UserDao;
import eShop.entities.concretes.User;

public class UserManager implements UserService {
    
	private UserDao userDao;
	private VerificationService verificationservice;
	private ValidatorService validatorService;
	
	public UserManager(UserDao userDao,VerificationService verificationService,ValidatorService validatorService) {
		
		this.userDao = userDao;
		this.verificationservice = verificationService;
		this.validatorService = validatorService;
	}

	
	
	@Override
	public void register(User user) {
		
		if(!verificationservice.isValid(user)) {
			System.out.println("Kayit Basarisiz !");
		}
		else if(!userDao.emailCheck(user)) {
			System.out.println("Bu email adresi daha önce alinmis!");
		}
		else {
			userDao.add(user);
			validatorService.sendVerificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		
		if(userDao.loginByCheck(email, password)) {
			System.out.println("Giris Basarili");
		}
		else {
			System.out.println("Hatali Bilgi Girisi!");
		}
		
	}

}
