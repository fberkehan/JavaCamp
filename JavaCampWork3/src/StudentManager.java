
public class StudentManager extends UserManager{
	

	public void addUser(User user) {
		System.out.println("Kullan�c� Eklendi : " + user.getName());
		
	}

	public void removeUser(User user) {
		System.out.println("Kullan�c� Silindi : " + user.getName());
	}

	public void updateUser(User user) {
		System.out.println("Kullan�c� G�ncellendi : " + user.getName());
	}

}
