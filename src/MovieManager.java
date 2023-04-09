import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager{

	static Scanner scanner = new Scanner(System.in);
	
	public static void addMovie(ArrayList<Movie> movieList) {

		ArrayList<Actor> actors = new ArrayList<>();

        System.out.println("Please enter the movie id: ");
        int id = 0;

        while(true) {
        	 try {
                 id = scanner.nextInt();
                 break;
             } catch (Exception e) {
                 System.out.println("Invalid format. Please enter a number.");
                 scanner.nextLine();
                 return;
             }
        }
       

        scanner.nextLine();

        System.out.println("Please enter the movie title: ");
        String title = scanner.nextLine();

        System.out.println("Please enter the movie's director: ");
        String director = scanner.nextLine();

        System.out.println("Enter actor number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the movie's actors: ");

        int i = 0;
        while (i != number) {
            System.out.println(i + 1 + ". actor: ");
            String name = scanner.nextLine();
            Actor actor = new Actor(name);
            actors.add(actor);
            i++;
        }

        LocalDate date;

        while (true) {
            System.out.println("Please enter the movie's date time (yyyy-MM-dd): ");
            String movieDate = scanner.nextLine();

            try {
                date = LocalDate.parse(movieDate);
                break;
            } catch (Exception e) {
                System.out.println("Invalid format. Please enter the date/time in the format yyyy-MM-dd");
                date = null;
            }
        }

        System.out.println("Please enter the movie's description");
        String description = scanner.nextLine();

        System.out.println("Please enter the movie's type (DRAMA, HORROR, ACTION, COMEDY, esc.): ");
        String type = scanner.nextLine().toUpperCase();

        MovieTypes movieType = null;
        try {
            movieType = MovieTypes.valueOf(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid movie type");
            return;
        }

        Movie movie = new Movie(id, title, director, actors, date, description, movieType);
        System.out.println(movie.toString());
        movieList.add(movie);
		
	}
	
	public void deleteMovie(ArrayList<Movie> movieList) {
	    System.out.print("Enter the name of the movie you want to delete: ");
	    String movieName = scanner.nextLine();
	    
	    boolean isFound = false;
	    for (int i = 0; i < movieList.size(); i++) {
	        if (movieList.get(i).getMovieTitle().equalsIgnoreCase(movieName)) {
	            movieList.remove(i);
	            System.out.println("Movie " + movieName + " has been deleted.");
	            isFound = true;
	            break;
	        }
	    }
	    if (!isFound) {
	        System.out.println("Movie " + movieName + " not found.");
	    }
	}
    public static void searchMovie(ArrayList<Movie> movieList) {
    
    	if(movieList.size()==0)
    	{
    	  System.out.println("No movie data in the system");
    	}
    	else {
    		System.out.println("Please enter the name of movie that you want to search: ");
        	String name = scanner.nextLine();
    		for(Movie movie : movieList) {
        		
        		if(name.equalsIgnoreCase(movie.getMovieTitle())) {
        				System.out.println("The movie you were looking for was found");
        		        return; 
        		        }	
    	}
            System.out.println("The movie you were looking for was not found");	
	}
    }
    
    
    public static void listMovie(ArrayList<Movie> movieList) {
    	
    	for(Movie movie : movieList) {
    		
    		System.out.println();
    		movie.listMovie();
	
    	}
    	
    	
    }
    
    
}
