
import java.util.ArrayList;


public class DataManager {

   private static ArrayList<Movie> movies;
   private ArrayList<Customer> customers;
   public DataManager() {
	   movies = new ArrayList<>();
	   customers = new ArrayList<>();
   }
   public static int getNumberOfMovies()
   {
       return movies.size();
   }
   public void addMovie(Movie movie) {
       movies.add(movie);
   }

   public void deleteMovie(Movie movie) {
       movies.remove(movie);
   }

   public void insertMovie(Movie movie) {
       for (int i = 0; i < movies.size(); i++) {
           if (movie.compareTo(movies.get(i)) < 0) {
               movies.add(i, movie);
               break;
           }
       }
   }

   public Movie findMovie(String title) {
       for (Movie movie : movies) {
           if (movie.getTitle().equals(title)) {
               return movie;
           }
       }
       return null;
   }

   public ArrayList<Movie> findMoviesByActorName(Name actor) {
       ArrayList<Movie> actorMovies = new ArrayList<>();
       for (Movie movie : movies) {
           if (movie.getNamesOfActors().contains(actor)) {
               actorMovies.add(movie);
           }
       }
       return actorMovies;
   }

   public ArrayList<Movie> findMoviesByYear(int year) {
       ArrayList<Movie> yearMovies = new ArrayList<>();
       for (Movie movie : movies) {
           if (movie.getYearOfRelease() == year) {
               yearMovies.add(movie);
           }
       }
       return yearMovies;
   }

   public ArrayList<Movie> findMoviesByTimePeriod(int startYear, int endYear) {
       ArrayList<Movie> yearMovies = new ArrayList<>();
       for (Movie movie : movies) {
           if (movie.getYearOfRelease() >= startYear
                   && movie.getYearOfRelease() <= endYear) {
               yearMovies.add(movie);
           }
       }
       return yearMovies;
   }

   public ArrayList<Customer> findMoviesByCustomer(String customerId) {
	   ArrayList<Customer> customerMovies = new ArrayList<>();
	   for (Customer customer : customers) {
           if (customer.getCustomerId().equals(customerId)) {
               customerMovies.add(customer);
           }
       }
       return customerMovies;
   }

   public void printMoviesInOrder() {
       for (Movie movie : movies) {
           System.out.println(movie);
       }
   }

}