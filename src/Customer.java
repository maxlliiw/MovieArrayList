
import java.util.ArrayList;

/**
 * @author William Shaw, Vishal Shah
 *
 */
public class Customer {
	
private Name name;
private static String customerId;
private ArrayList<Movie> rentedMovies;

public Customer()
{
	name = new Name();
	customerId = "";
	rentedMovies = new ArrayList<>();
}

public Name getName() {
       return name;
   }

   /**
 * @param name
 */
public void setName(Name name) {
       this.name = name;
   }

   /**
 * @return
 */
public static String getCustomerId() {
       return customerId;
   }

   /**
 * @param customerId
 */
public static void setCustomerId(String customerId) {
       Customer.customerId = customerId;
   }

   /**
 * @return
 */
public ArrayList<Movie> getRentedMovies() {
       return rentedMovies;
   }

   /**
 * @param rentedMovies
 */
public void setRentedMovies(ArrayList<Movie> rentedMovies) {
       this.rentedMovies = rentedMovies;
   }

 
   /* (non-Javadoc)eyoudujfighdsudwgfdshfud
 * @see java.lang.Object#toString()
 */
public String toString() {
       return "Customer [name=" + name + ", rentedMovies=" + rentedMovies
               + "]";
   }

}