
public class UserManager {
	
public void addUser(User user) {
	System.out.println("Kullanici Eklendi : " + user.getName());
	
}

public void removeUser(User user) {
	System.out.println("Kullanici Silindi : " + user.getName());
}

public void updateUser(User user) {
	System.out.println("Kullanici Güncellendi : " + user.getName());
}


}
