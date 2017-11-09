
import java.util.ArrayList;

public class Movie {
  
   private String title;
   private int yearOfRelease;
   private int duration;
   private int numberOfCopiesAvailable;
   private ArrayList<Name> namesOfActors;
   
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
   
   public void setNamesOfActors(ArrayList<Name> namesOfActors) {
       this.namesOfActors = namesOfActors;
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
   
   public String toString() {
       return "Movie [title=" + title + ", yearOfRelease=" + yearOfRelease
               + ", duration=" + duration + ", numberOfCopiesAvailable="
               + numberOfCopiesAvailable + ", namesOfActors=" + namesOfActors
               + "]";
   }
  

}