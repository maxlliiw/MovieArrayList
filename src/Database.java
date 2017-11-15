import java.util.ArrayList;
import java.util.Iterator;

public class Database {
	private ArrayList<DataManager> mdata;
	private DataManager dataMann;
	
	public Database()
	{
		mdata = new ArrayList<>();
	}
	public void addDataBase(DataManager data)
	{
		mdata.add(data);
	}
	public void removeDataBase(DataManager data)
	{
		boolean found = false;
		int index = 0;
		Iterator<DataManager> it = mdata.iterator();
		while(it.hasNext() && !found)
		{
			if(it.next().equals(data))
			{
				mdata.remove(index);
				found = true;
			}
			index++;
		}
	}
	public void listAllMovies()
	{
		Iterator<DataManager> it = mdata.iterator();
		if(DataManager.getNumberOfMovies()<=0)
		{
		while(it.hasNext())
		{
			it.next().printMoviesInOrder();
		}
		}
		else
		{
			System.out.println("ERROR NO Movies");
		}
	}
	public void listMoviesByActor(Name name)
	{
		ArrayList<Movie> actorMovies = new ArrayList<>();
		actorMovies = dataMann.findMoviesByActorName(name);
		for(int i = 0;i<=actorMovies.size();i++)
		{
			System.out.println(actorMovies.get(i));
		}
	}
	public void listMoviesByYear(int year)
	{
		ArrayList<Movie> yearMovies = new ArrayList<>();
		yearMovies = dataMann.findMoviesByYear(year);
		for(int i = 0;i<=yearMovies.size();i++)
		{
			System.out.println(yearMovies.get(i));
		}
	}
	public void listMoviesByTimePeriod(int startYear, int endYear)
	{
		ArrayList<Movie> yearMovies = new ArrayList<>();
		yearMovies = dataMann.findMoviesByTimePeriod(startYear, endYear);
		for(int i = 0;i<=yearMovies.size();i++)
		{
			System.out.println(yearMovies.get(i));
		}
	}
	public void listMoviesByCustomer(String CustomerId)
	{
		ArrayList<Customer> customerMovies = new ArrayList<>();
		customerMovies = dataMann.findMoviesByCustomer(CustomerId);
		for(int i = 0;i<=customerMovies.size();i++)
		{
			System.out.println(customerMovies.get(i));
		}
	}
}
