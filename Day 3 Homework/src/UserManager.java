
public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + " eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user:users) 
		{
			add(user);
		}
	}

}
