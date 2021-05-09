
public class InstructorManager extends UserManager{
	
	public void addUser(User user) {
		System.out.println("Egitimci Eklendi : " + user.getName());
		
	}

	public void removeUser(User user) {
		System.out.println("Egitimci Silindi : " + user.getName());
	}

	public void updateUser(User user) {
		System.out.println("Egitimci Güncellendi : " + user.getName());
	}
	
}
