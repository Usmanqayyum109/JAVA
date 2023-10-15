import java.util.Comparator;

public class NameComparator implements Comparator<Salah>
{
	
    @Override
    public int compare(Salah nemaz, Salah nemaz1)
	{
		return nemaz.getName().compareTo(nemaz1.getName());
		
	}

}