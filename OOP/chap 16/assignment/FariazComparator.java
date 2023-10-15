import java.util.Comparator;

public class FariazComparator implements Comparator<Salah>
{
	
	@Override
	public int compare(Salah nemaz, Salah nemaz1)
	{
		if(nemaz.getFariaz()== nemaz1.getFariaz())
			return 0;
		else if(nemaz.getFariaz() > nemaz1.getFariaz())
			return 1;
		else
		return -1;
	}

}