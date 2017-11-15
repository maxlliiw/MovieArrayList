
import java.util.ArrayList;

public class Movie {
  
   private String title;
   private int yearOfRelease;
   private int duration;
   private int numberOfCopiesAvailable;
   private ArrayList<Name> namesOfActors;
   private ArrayList<Customer> namesOfCustomers;
   public Movie(String title, int yearOfRelease, int duration, int NumberOfCopiesAvalible) {
	   title = this.title;
	   yearOfRelease = this.yearOfRelease;
	   duration = this.duration;
	   numberOfCopiesAvailable = this.numberOfCopiesAvailable;
	   namesOfActors = new ArrayList<>();
	   namesOfCustomers = new ArrayList<>();
   }
   
   public String getTitle() {
       return title;
   }
   
   public void setTitle(String title) {
       this.title = title;
   }
   
   public int getYearOfRelease() {
       return yearOfRelease;
   }
   
   public void setYearOfRelease(int yearOfRelease) {
       this.yearOfRelease = yearOfRelease;
   }
   
   public int getDuration() {
       return duration;
   }
   
   public void setDuration(int duration) {
       this.duration = duration;
   }
   
   public int getNumberOfCopiesAvailable() {
       return numberOfCopiesAvailable;
   }
   
   public void setNumberOfCopiesAvailable(int numberOfCopiesAvailable) {
       this.numberOfCopiesAvailable = numberOfCopiesAvailable;
   }
   
   public ArrayList<Name> getNamesOfActors() {
       return namesOfActors;
   }
   
   public void setNamesOfActors(Name actor) {
       namesOfActors.add(actor);
   }
   public void setNamesOfCustomers(Customer customer)
   {
	   namesOfCustomers.add(customer);
   }
   
   public int compareTo(Movie movie) {
       return title.compareTo(movie.getTitle());
   }
  
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Movie other = (Movie) obj;
       if (title == null) {
           if (other.title != null)
               return false;
       } else if (!title.equals(other.title))
           return false;
       return true;
   }
   
   public String getMovieDetails() {
       return "Movie Title: " + title + ", Year Released" + yearOfRelease
               + ", Duration in minute(s)" + duration + "minute(s)" + ", Number of Copies Avalible: "
               + numberOfCopiesAvailable + ", Cast: " + namesOfActors
               + "]";
   }
  

}