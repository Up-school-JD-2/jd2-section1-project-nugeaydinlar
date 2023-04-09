import java.util.ArrayList;
import java.time.LocalDate;

public class Movie {

	private int movieId;
	private String movieTitle;
	private String director;
	private ArrayList<Actor> actors;
	private LocalDate dateTimeDate;
	private String movieDescription;
	private MovieTypes moiveType;
	
	
	public Movie(int movieId, String movieTitle, String director, ArrayList<Actor> actors, LocalDate dateTimeDate,
			String movieDescription, MovieTypes moiveType) {
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.director = director;
		this.actors = actors;
		this.dateTimeDate = dateTimeDate;
		this.movieDescription = movieDescription;
		this.moiveType = moiveType;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public ArrayList<Actor> getActors() {
		return actors;
	}


	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}


	public LocalDate getDateTimeDate() {
		return dateTimeDate;
	}


	public void setDateTimeDate(LocalDate dateTimeDate) {
		this.dateTimeDate = dateTimeDate;
	}


	public String getMovieDescripton() {
		return movieDescription;
	}


	public void setMovieDescripton(String movieDescripton) {
		this.movieDescription = movieDescripton;
	}


	public MovieTypes getMoiveType() {
		return moiveType;
	}


	public void setMoiveType(MovieTypes moiveType) {
		this.moiveType = moiveType;
	}


	public void listMovie() {
	    String actorsString = "";
	    for (Actor actor : actors) {
	        actorsString += actor.getName() + ", ";
	    }
	  
		   System.out.println("Moive id: " + movieId);
		   System.out.println("Movie title: " + movieTitle);
		   System.out.println("Movie director: " + director);
		   System.out.println("Movie actors: " + actorsString);
		   System.out.println("Movie date time: " + dateTimeDate);
		   System.out.println("Movie descripton: " + movieDescription);
		   System.out.println("Movie type: " + moiveType);
		}

}
