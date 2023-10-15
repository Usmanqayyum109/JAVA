public class Salah implements Comparable<Salah>
{
	private String name;
	
	private int sunnah;
	
	private int fariaz;
	
	private int time;
	
	
	public Salah(String name, int sunnah,int fariaz,int time)
	{
		this.name=name;
		
		this.sunnah=sunnah;
		
		this.fariaz=fariaz;
		
		this.time=time;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSunnah(int sunnah)
	{
		this.sunnah=sunnah;
	}
	
	
	
	public int getSunnah()
	{
		return sunnah;
	}
	
	public void setFariaz(int fariaz)
	{
		this.fariaz=fariaz;
	}
	
	public int getFariaz()
	{
		return fariaz;
	}
	
	public void setTime(int time)
	{
		this.time=time;
	}
	
	public int getTime()
	{
		return time;
	}
	
	 @Override
    public String toString()
	{
        return String.format("Name: %s Sunnah: %d Faraiz: %d Time: %d", name, sunnah, fariaz, time);
    }
	
	@Override
	public int compareTo(Salah nemaz)
	{
		if(this.time == nemaz.getTime())
			return 0;
		else if(this.time > nemaz.getTime())
			return 1;
		else
			return -1;
	}
}