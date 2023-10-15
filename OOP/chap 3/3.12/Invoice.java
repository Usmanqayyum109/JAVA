public class Invoice
{
	private String number;
	private String description;
	private int purchased;
	private double price;

	
	public Invoice(String number, String description, int purchased,double price)
	{
		this. number = number;
		this.description = description;
		
		if (purchased <= 0)
			purchased = 0;
		else
			this.purchased = purchased;
		
		if (price <= 0.0)
			price = 0.0;
		else
			this.price = price;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setPurchased(int purchased)
	{
		if (purchased <= 0)
			purchased = 0;
		else
			this.purchased = purchased;
	}
	
	public int getPurchased()
	{
		return purchased;
	}
	
	public void setPrice(double price)
	{
		if (price <= 0.0)
			price = 0.0;
		else
			this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
    
	public double getInvoiceAmount()
	{
		return  purchased * price;
	}
}