package dataAccess.concretes;

import dataAccess.Abstracts.UserDao;

import entities.concretes.User;
import java.util.ArrayList;

public class HibernateUserDao implements UserDao{

	ArrayList<User> usersDb = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		usersDb.add(user);
		System.out.println(user.getName() + " Isimli kullanici sisteme eklendi.");
		
	}

	@Override
	public void update(User user) {

		System.out.println(user.getName() + " Isimli kullanici guncellendi.");
	}

	@Override
	public void delete(User user) {
		usersDb.remove(user);
		System.out.println(user.getName() + " Isimli kullanici sistemden silindi.");
		
	}

	@Override
	public void getAll() {
		System.out.println("====== Kullanicilar Listeleniyor ======");
		for(User user: usersDb) {
			System.out.println("Isim : " + user.getName() + " " + user.getSurName());
		}
		System.out.println("====== Kullanicilar Listelendi ======");
	}

}
