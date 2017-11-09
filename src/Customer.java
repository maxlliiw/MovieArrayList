
import java.util.ArrayList;

public class Customer {
   private Name name;
   private static String customerId;
   private ArrayList<Movie> rentedMovies;

   public Name getName() {
       return name;
   }

   public void setName(Name name) {
       this.name = name;
   }

   public static String getCustomerId() {
       return customerId;
   }

   public static void setCustomerId(String customerId) {
       Customer.customerId = customerId;
   }

   public ArrayList<Movie> getRentedMovies() {
       return rentedMovies;
   }

   public void setRentedMovies(ArrayList<Movie> rentedMovies) {
       this.rentedMovies = rentedMovies;
   }

 
   public String toString() {
       return "Customer [name=" + name + ", rentedMovies=" + rentedMovies
               + "]";
   }

}