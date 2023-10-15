import java.util.Comparator;

public class SunnahComparator implements Comparator<Salah>
{
	
	@Override 
	public int compare(Salah nemaz, Salah nemaz1)
	{
		if(nemaz.getSunnah()==nemaz1.getSunnah())
			return 0;
		else if(nemaz.getSunnah() > nemaz1.getSunnah())
		return 1;
		else
		return -1;
	}

}