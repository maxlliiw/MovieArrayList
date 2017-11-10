import java.util.ArrayList;
import java.util.Iterator;

public class Database {
	private ArrayList<DataManager> mdata;
	
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
}
