import java.awt.desktop.UserSessionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    static Scanner scanner = new Scanner(System.in);
	
	public static void creatAnAccount(ArrayList<User> userList) {
	    int id = 0;
		while(true)
		{
			System.out.println("Please enter your id: ");
			id=0;
			
			try {
				 id = scanner.nextInt();
				 break;
			} catch (Exception e) {
				System.out.println("Invalid format. Please enter a number.");
			}
			scanner.nextLine();
		}
		scanner.nextLine();
		
		System.out.println("Please enter your username: ");
        String username = scanner.nextLine();  
		
		System.out.println("Please enter your password: ");
		String password = scanner.nextLine(); 

		System.out.println("Please enter your mail: ");
		String mail = scanner.nextLine(); 
		

        try {
        	User createdUser = new User(id, username, password, mail);
        	System.out.println(createdUser.getUserName() + " named account created.");
        	userList.add(createdUser);
        	
		} catch (Exception e) {
			System.out.println("Failed to create user.");
		}
		
	}
	
	public static void deleteAnAccount(ArrayList<User> userList) {
		
		System.out.println("Please enter the name of the user that you will delete: ");
	    String deletedUserName = scanner.nextLine();
		
	    ArrayList<User> toBeDeletedUsers = new ArrayList<>();
		
	    if(userList == null) {
	    	System.out.println("There is no user in the system");
	    }
	    else {
	    	for(User user : userList) {
		    	
		        if(deletedUserName.equalsIgnoreCase(user.getUserName())) {
		            toBeDeletedUsers.add(user);
		            System.out.println("Deleted");
		        }
		        else {
		            System.out.println("No user found with the name you entered.");
		        }
		    }
			
		    for(User user : toBeDeletedUsers) {
		        userList.remove(user);
		    }	
	    }
	    
		
		
		
		
	}
	
	public static void searchUser(ArrayList<User> userList) {
		if(userList.size()==0)
		{
			System.out.println("No user data in the system.");
		}
		else {
			System.out.println("Please enter the name of user that you want to search: ");
	    	String name = scanner.nextLine();
	    	
	    	for(User user : userList)
	    		if(name.equalsIgnoreCase(user.getUserName()))
	    				System.out.println("The user you were looking for was found");
	    		else 
	                    System.out.println("The user you were looking for was not found");
		}
		
	}
	
	public static User login(ArrayList<User> userList) {
		
		System.out.println("Please enter your username: ");
		String username = scanner.nextLine();
		
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		
		User loggedUser=null;
		
		for(User user : userList) {
			
			if(username.equals(user.getUserName()) && password.equals(user.getUserPassword())) {
				 loggedUser = user;	
			}
			else 
				System.out.println("Invalid username or password");	
		}
		
		return loggedUser;
		
	}

}

