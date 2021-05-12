package core.entites;

import GoogleAccount.GoogleAccount;

public class GoogleServiceAdapter implements AccountService{

	@Override
	public void signUpWithGoogle() {
		GoogleAccount googleAccount = new GoogleAccount();
		googleAccount.signUpWithGoogle();
		
	}

}
