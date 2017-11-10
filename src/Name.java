
public class Name{
  
   private String firstName;
   private String lastName;
   public Name(String firstName, String lastName)
   {
	   setFirstName(firstName);
	   setLastName(lastName);
   }
   public String getFirstName() {
       return firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   public String getLastName() {
       return lastName;
   }
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   
   public int compareTo(Name name) {
       String name1 = firstName + lastName;
       String name2 = name.getFirstName() + name.getLastName();
       return name1.compareTo(name2);
   }
   
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
           
       if (obj == null)
           return false;
           
       if (getClass() != obj.getClass())
           return false;
           
       Name other = (Name) obj;
       
       if (firstName == null) {
           if (other.firstName != null)
               return false;
               
       } else if (!firstName.equals(other.firstName))
           return false;
       if (lastName == null) {
           if (other.lastName != null)
               return false;
               
       } else if (!lastName.equals(other.lastName))
           return false;
       return true;
    }
}