package core.entites;

import core.Abstracts.MailService;
import entities.concretes.User;

public class MailManager implements MailService{

	@Override
	public void sendVerificationMail(User user) {
		System.out.println(user.geteMail() + " 'adli e-Postaya dogrulama baglantisi gonderildi.");
		
	}

	@Override
	public void verifyUser(User user) {
		System.out.println("Tebrikler " + user.getName() + "! Hesabinizi doðruladiniz.");
		}

}
