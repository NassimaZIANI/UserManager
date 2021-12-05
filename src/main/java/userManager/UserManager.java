package userManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserManager {
	
	private Map<Integer, User> users;

	public UserManager() {
		users = new HashMap<Integer, User>();
		users.put(123, new User(123, "password123", "user1", "firstname1"));
		users.put(234, new User(234, "password145", "user2", "firstname2"));
		users.put(356, new User(356, "password465", "user3", "firstname3"));
		users.put(843, new User(843, "password656", "user5", "firstname5"));
		users.put(2135, new User(2135, "password644", "user4", "firstname4"));
	}
	
	public boolean existUser(int id) {
		return users.containsKey(id);
	}
	
	public boolean addUser(int id, String password, String lastName, String firstName) {
		
		if(id <= 0 || password == null || lastName == null || firstName == null) {
			return false;
		}
		
		User user = new User(id, password, lastName, firstName);
		
		if(!existUser(id)) {
			users.put(id, user);
			return true;
		}
		return false;
	}
	
	public boolean login(int id, String password) {
		
		if(id <= 0 || password == null) {
			return false;
		}
		
		if(!existUser(id)) return false;
		
		return users.get(id).verifIdentity(password);
	}
	
	public String getUserFullName(int id) {
		if (users.containsKey(id)) {
			return users.get(id).getLastname() + " " + users.get(id).getFirstname();
		}
		return null;
	}

}
