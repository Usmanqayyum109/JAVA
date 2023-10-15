import java.util.ArrayList;

import java.util.List;

import java.util.Collections;

 public class Sorting
 {
	public static void main(String[] args) 
	{
		List<Salah> salah=new ArrayList<>();
   
   
		salah.add(new Salah("Fajar",2,2,6));
		
		salah.add(new Salah("Zahor",6,4,14));
		
		salah.add(new Salah("Asar", 0,4,16));
		
		salah.add(new Salah("Magrib",2,3,18));
		
		salah.add(new Salah("Isha", 2,4,20)); 
  
		System.out.println("Unsorted List");
		for(Salah nemaz: salah)
		{
			System.out.println(nemaz); 
		}
  
  
		Collections.sort(salah);
		
		System.out.println("Sorted List");
  
		for(Salah nemaz: salah)
		{
			System.out.println(nemaz); 
		}
  
		System.out.println("Sorted List by Sunnah");
		
		Collections.sort(salah, new SunnahComparator());
		
		for(Salah nemaz: salah)
		{
			System.out.println(nemaz); 
		}
   
		System.out.println("Sorted List by Fariaz");
		
		Collections.sort(salah, new FariazComparator());
		
		for(Salah nemaz: salah)
		{
			System.out.println(nemaz); 
		}
  
       System.out.println("Sorted List by Name");
	   
		Collections.sort(salah, new NameComparator());
		
		for(Salah nemaz: salah)
		{
			System.out.println(nemaz); 
		}
	}
}