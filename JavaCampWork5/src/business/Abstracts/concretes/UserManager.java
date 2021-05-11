package business.Abstracts.concretes;

import business.Abstracts.Abstracts.CheckService;
import business.Abstracts.Abstracts.UserService;
import dataAccess.Abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	CheckService checkService;
	UserDao userDao;
	public UserManager(CheckService checkService, UserDao userDao)
	{
		this.checkService = checkService;
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		if(checkService.checkName(user) == false) {
			System.out.println("Kayit basarisiz. Lutfen isminizi kontrol ediniz.");
			return;
		}
		if(checkService.checkMail(user.geteMail()) == false) {
			System.out.println("Kayit basarisiz. Lutfen mail adresinizi dogru kontrol ediniz.");
			return;
		}
		if(checkService.checkPassword(user.getPassword()) == false) {
			System.out.println("Kayit basarisiz. Lutfen sifrenizi formata uygun girin." + user.getPassword());
			return;
		}
		
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		userDao.getAll();
		
	}

}
