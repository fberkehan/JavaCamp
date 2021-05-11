import business.Abstracts.Abstracts.UserService;
import business.Abstracts.concretes.CheckManager;
import business.Abstracts.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "mbkcheat@gmail.com", "Mert Bekir", "Karademir", "123456");
		User user2 = new User(2, "mbkcheat@gmail.com", "AAAA", "BBBBB", "123456");
		User user3 = new User(2, "mbkcheat@gmail.com", "CCCC", "DDDDD", "123456");
		UserService userManager = new UserManager(new CheckManager(),new HibernateUserDao());
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		
		userManager.getAll();
	}

}
