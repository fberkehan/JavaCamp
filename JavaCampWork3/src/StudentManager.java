
public class StudentManager extends UserManager{
	

	public void addUser(User user) {
		System.out.println("Kullanýcý Eklendi : " + user.getName());
		
	}

	public void removeUser(User user) {
		System.out.println("Kullanýcý Silindi : " + user.getName());
	}

	public void updateUser(User user) {
		System.out.println("Kullanýcý Güncellendi : " + user.getName());
	}

}
