
import java.util.ArrayList;


public class DataManager {

   private static ArrayList<Movie> movies;
   private ArrayList<Customer> customers;
   private Movie DieHard;
   private Movie TheImitationGame;
   private Movie Deadpool;
   private Movie BabyDriver;
   private Movie BobTheBuilder;
   private Name BruceWillis;
   private Name BradleyCooper;
   private Name MattDamon;
   private Name RobertDowny;
   private Name ChrisHuntsworth;
   private Name BobBuilder;
   private Customer WilliamShaw;
   private Customer VishalShah;
   private Customer BoSun;
   
   public DataManager() {
	   DieHard = new Movie("Die Hard", 1988, 140, 1000000);
	   TheImitationGame = new Movie("The Imitation Game", 2015, 134, 10000000);
	   Deadpool = new Movie("Deadpool", 2016, 140, 1000000);
	   BabyDriver = new Movie("Baby Driver", 1988, 140, 1000000);
	   BobTheBuilder = new Movie("BobTheBuilder", 1988, 140, 1000000);
	   BruceWillis = new Name("Bruce","Willis");
	   BradleyCooper = new Name("Bradley", "Cooper");
	   MattDamon = new Name("Matt", "Damon");
	   RobertDowny = new Name("Robert", "Downy");
	   ChrisHuntsworth = new Name ("Chris","Huntsworth");
	   BobBuilder = new Name ("Bob","Builder");
	   WilliamShaw = new Customer ("William","Shaw", "C3P0");
	   VishalShah = new Customer ("Vishal","Shah", "66211");
	   BoSun = new Customer ("Bo","Sun", "1337");
	   
	   movies = new ArrayList<>();
	   customers = new ArrayList<>();
   }
   public static int getNumberOfMovies()
   {
       return movies.size();
   }
   public void addMovie(Movie movie) 
   {
       movies.add(movie);
   }
   public void addCustomer(Customer customer, Movie movie)
   {
	   movie.setNamesOfCustomers(customer);
   }
   public void addActor(Name actor, Movie movie)
   {
	   movie.setNamesOfActors(actor);
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