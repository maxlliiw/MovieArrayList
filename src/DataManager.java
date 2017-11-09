
import java.util.ArrayList;


public class DataManager {

   private ArrayList<Movie> movies = new ArrayList<Movie>();
   private ArrayList<Customer> customers = new ArrayList<Customer>();

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

   public ArrayList<Movie> findMoviesByCustomer(String customerId) {
       for (Customer customer : customers) {
           if (customer.getCustomerId().equals(customerId)) {
               return customer.getRentedMovies();
           }
       }
       return null;

   }

   public void printMoviesInOrder() {
       for (Movie movie : movies) {
           System.out.println(movie);
       }
   }

}