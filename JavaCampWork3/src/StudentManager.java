
public class StudentManager extends UserManager{
	

	public void addUser(User user) {
		System.out.println("Kullanıcı Eklendi : " + user.getName());
		
	}

	public void removeUser(User user) {
		System.out.println("Kullanıcı Silindi : " + user.getName());
	}

	public void updateUser(User user) {
		System.out.println("Kullanıcı Güncellendi : " + user.getName());
	}

}
