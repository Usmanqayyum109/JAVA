/**                                  UML
		     _______________________________________________________ 
		    |                     Invoice                          |
            |______________________________________________________|
            |                                                      |
            |-partNumber:String  		                           |
            |-partDescription:String                               |
			|-quantityItem:int                                     |
			|-pricePerItem:double                                  |
            |______________________________________________________|
            |                                                      |
            |<<constructor>>Invoice(partNumber:String,             |
			|partDescription:String, quantityItem:int, pricePerItem|
			|:double)                                              |
            |+setPartNumber(partNumber : String)                   |
            |+getPartNumber() : String                             |
            |+setPartDescription(partDescription : String)         |
            |+getPartDescription() : String                        |
            |+setQuantityItem(quantityItem : int)                  |
			|+getQuantityItem(): int                               |
            |+setPricePerItem(pricePerItem : double)               |
            |+getPricePerItem() : double                           |
            |+getInvoiceAmount() : double			
            |______________________________________________________|        */
			
			
// Exercise. 3.12: Invoice.java
// Hardware store invoice for an item sold at the store
public class Invoice
{
	private String partNumber; // instance variable
	private String partDescription; // instance variable
	private int quantityItem; // instance variable
	private double pricePerItem; // instance variable
	
	// Invoice constructor that recives four parameter
	public Invoice(String partNumber, String partDescription, int quantityItem,
		double pricePerItem)
		{
			// assign partNumber to instance variable partNumber
			this.partNumber = partNumber;
			// assign partDescription to instance variable partDescription
			this.partDescription = partDescription;
			
			// validate that the quantityItem is greater then 0.0; if it's not,
		    // instance variable quantityItem keeps its default initial value of
			//  0.0
			if (quantityItem > 0.0) // if the quantityItem is validate
				this.quantityItem = quantityItem; // assign it to instance variable quantityItem
			
			// validate that the pricePerItem is greater then 0.0; if it's not,
		    // instance variable pricePerItem keeps its default initial value 
			// of 0.0
			if (pricePerItem > 0.0) // if the pricePerItem is validate
				this.pricePerItem = pricePerItem; // assign it to instance variable pricePerItem
		}
		
		// method that sets the partNumber
		public void setPartNumber(String partNumber)
		{
			// assign partNumber to instance variable partNumber
			this.partNumber = partNumber;
		}
		
		// method returns the partNumber
		public String getPartNumber()
		{
			return partNumber; // give value of partNumber back to caller
		}
		
		
		// method that sets the partDescription
		public void setPartDescription(String partDescription)
		{
			// assign partDescription to instance variable partDescription
			this.partDescription = partDescription;
		}
		
		// method returns the partDescription
		public String getPartDescription() 
		{
			return partDescription; // give value of partDescription back to caller
		}
		
		
		// method that sets the quantityItem
		public void setQuantityItem(int quantityItem)
		{
			// validate that the quantityItem is greater then 0.0; if it's not,
		    // instance variable quantityItem keeps its default initial value of
			//  0.0
			if (quantityItem > 0.0) // if the quantityItem is validate
				this.quantityItem = quantityItem; // assign it to instance variable quantityItem
		}
		
		// method returns the quantityItem
		public int getQuantityItem()
		{
			return quantityItem; // give value of quantityItem back to caller
		}
		
		
		// method that sets the pricePerItem
		public void setPricePerItem(double pricePerItem)
		{
// validate that the pricePerItem is greater then 0.0; if it's not,
		    // instance variable pricePerItem keeps its default initial value 
			// of 0.0
			if (pricePerItem > 0.0) // if the pricePerItem is validate
				this.pricePerItem = pricePerItem; // assign it to instance variable pricePerItem
		}
		
		// method returns the pricePerItem
		public double getPricePerItem()
		{
			return pricePerItem; // give value of pricePerItem back to caller
		}
		
		
		// method that calculate quantityItem multilpe with pricePerItem
		// and returns the amount of invoice
		public double getInvoiceAmount()
		{
			// validate that the quantityItem is greater then 0.0; if it's not,
		    // instance variable quantityItem keeps its default initial value 
			// of 0.0
			if (quantityItem < 0.0)
			this.quantityItem = 0;
			
			// validate that the pricePerItem is greater then 0.0; if it's not,
		    // instance variable pricePerItem keeps its default initial value 
			// of 0.0
			if (pricePerItem < 0.0)
				this.pricePerItem = 0.0;
			
			// give value of invoice amount back to caller
			return quantityItem * pricePerItem;
		}
	
}