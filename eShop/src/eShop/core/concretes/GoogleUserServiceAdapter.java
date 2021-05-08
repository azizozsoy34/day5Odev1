package eShop.core.concretes;

import eShop.GoogleUser.GoogleUserService;
import eShop.core.abstracks.VerificationService;
import eShop.entities.concretes.User;

public class GoogleUserServiceAdapter implements VerificationService {

	@Override
	public boolean isValid(User user) {
        
		GoogleUserService googleUserValid = new GoogleUserService();
		
		return googleUserValid.isValid();
	}

}
