package eShop.core.concretes;

import eShop.core.abstracks.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationMail() {
		
		System.out.println("Dogrulama maili yollandi.");
		
	}

}
