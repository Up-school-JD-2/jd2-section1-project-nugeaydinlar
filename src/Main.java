import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ResourceBundle.Control;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		MovieTypes movieTypes = null;
		
		ArrayList<Movie> movieList = new ArrayList<>();				
		MovieManager movieManager = new MovieManager();
		
		ArrayList<User> userList = new ArrayList<>();
		UserManager userManager = new UserManager();
		User currentUser = null;
		
		ArrayList<Actor> theShawshankRedemptionActors = new ArrayList<>();  
		Actor theShawshankRedemptionActor1 = new Actor();	
		Actor theShawshankRedemptionActor2 = new Actor();
		
		theShawshankRedemptionActors.add(theShawshankRedemptionActor1);
		theShawshankRedemptionActors.add(theShawshankRedemptionActor2);
		
		ArrayList<Actor> theGodfatherActors = new ArrayList<>(); 
		Actor theGodfatherActors1 = new Actor();
	    Actor theGodfatherActors2 = new Actor();
	    
		theGodfatherActors.add(theGodfatherActors1);
		theGodfatherActors.add(theGodfatherActors2);
		
		ArrayList<Actor> theDarkNightActors = new ArrayList<>(); 
		Actor theDarkNightActors1 = new Actor();
		Actor theDarkNightActors2 = new Actor();
		
		theDarkNightActors.add(theDarkNightActors1);
		theDarkNightActors.add(theDarkNightActors2);
		
		
		ArrayList<Actor> forrestGumpActors = new ArrayList<>(); 
		Actor forrestGumpActors1 = new Actor();
		Actor forrestGumpActors2 = new Actor();
		
		forrestGumpActors.add(forrestGumpActors1);
		forrestGumpActors.add(forrestGumpActors2);
		
		ArrayList<Actor> inceptionActors = new ArrayList<>(); 
		Actor inceptionActors1 = new Actor();
		Actor inceptionActors2 = new Actor();

		inceptionActors.add(inceptionActors1);
		inceptionActors.add(inceptionActors2);
		
        Movie movie1 = new Movie(1, "The Shawshank Redemption", "Frank Darabont",theShawshankRedemptionActors, LocalDate.of(1994, 9, 23), "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", MovieTypes.DRAMA); 
        Movie movie2 = new Movie(2, "The Godfather", "Francis Ford Coppola",theGodfatherActors,LocalDate.of(1972, 3, 24), "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", MovieTypes.CRIME);
        Movie movie3 = new Movie(3, "The Dark Knight", "Christopher Nolan",theDarkNightActors , LocalDate.of(2008, 7, 18), "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", MovieTypes.ACTION);   
        Movie movie4 = new Movie(4, "Forrest Gump", "Robert Zemeckis", forrestGumpActors, LocalDate.of(1994, 7, 6), "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold through the perspective of an Alabama man with an IQ of 75.", MovieTypes.COMEDY);
        Movie movie5 = new Movie(5, "Inception", "Christopher Nolan", inceptionActors, LocalDate.of(2010, 7, 16), "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", MovieTypes.SCI_FI);
       
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
       
      
		boolean isExit = true;
		
		while(isExit) {
			System.out.println();
			System.out.println("****************************");
			System.out.println("0- Exit");
			
			if(currentUser == null) {	
				System.out.println("1- Create an account");
				System.out.println("2- Login");
			}
			else {
				System.out.println("1- Add movie");
				System.out.println("2- Delete movie");
				System.out.println("3- Search movie");
				System.out.println("4- Delete user");
				System.out.println("5- Search user");
				System.out.println("6- List movie");
				System.out.println("7- Logout");
			}	
			   
			int option = 0;

			while(true) {
				 try {
					    
					    System.out.println("****************************");
					    System.out.println("Please choose an option: ");
			            option = scanner.nextInt();
			            break;
			            
			        } catch (Exception e) {
			            System.out.println("Invalid format. Please enter a number.");
			            scanner.nextLine();
			        }
			}
	       
				
			
			switch (option) {
			case 1: {
				
				if(currentUser != null) {
					movieManager.addMovie(movieList);
					break;
				}
				else {
					userManager.creatAnAccount(userList);
					break;
				}
			}
				
			case 2: {
				if(currentUser != null) {
					movieManager.deleteMovie(movieList);
					break;
				}
				else {
					currentUser = userManager.login(userList);
					break;
					}	
			}
			
			case 3: {
				   movieManager.searchMovie(movieList);
				   break;
			}
				
			case 4: {
				   userManager.deleteAnAccount(userList);
				   break;		
			}
			
			case 5: {
				   userManager.searchUser(userList);
				   break;
			}	
			case 6: {			
				movieManager.listMovie(movieList);
				break;
				
			}	
			case 7: {
				currentUser = null;
				break;
			}
				
			case 0: {
				isExit = false;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);	
				
			}	
		}
		 	
		
	}
}
