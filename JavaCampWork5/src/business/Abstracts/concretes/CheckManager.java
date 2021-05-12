package business.Abstracts.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.Abstracts.Abstracts.CheckService;
import entities.concretes.User;

public class CheckManager implements CheckService{

	@Override
	public boolean checkMail(String mail) {
		
		 String mailFormat = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		 
		Pattern p = Pattern.compile(mailFormat);
		Matcher m = p.matcher(mail);

		if (m.matches()) {
			return true;
		}
		else {
			return false;
		}
	
		
	}

	@Override
	public boolean checkPassword(String password) {
		
		if(password.length() >= 6) {
		
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkName(User user) {
		if(user.getName().length() >= 2 && user.getSurName().length() >= 2) {
			return true;
		}else {
			return false;
		}
	
	}


}
