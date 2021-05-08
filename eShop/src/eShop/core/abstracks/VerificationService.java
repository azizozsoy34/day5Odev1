package eShop.core.abstracks;

import eShop.entities.concretes.User;

public interface VerificationService {
	boolean isValid(User user);
}
