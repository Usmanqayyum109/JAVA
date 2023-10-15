// Exercise. 3.12: InvoiceTest.java
// inputting four items from user and show the result to user

import java.util.Scanner;

public class InvoiceTest
{
	public static void main(String[]args)
	{
		Invoice invoice1 = new Invoice("coke", "better", 2, 20.00);
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// Display Invoice1
		System.out.printf("%ninvoice1 Part Number is %s.%n",
			invoice1.getPartNumber());
			
		System.out.printf("invoice1 Part Description is %s.%n",
			invoice1.getPartDescription());
			
		System.out.printf("invoice1 Quantity is %d.%n",
			invoice1.getQuantityItem());
			
		System.out.printf("invoice1 Price Per Item is %.2f%n",
			invoice1.getPricePerItem());
			
		System.out.printf("Your Total Amount is  %.2f.%n",
			invoice1.getInvoiceAmount());
			
			
		
		
		System.out.print("\nEnter the Part Number of the Sold Item:"); // propmt
		String partNumber = input.nextLine(); // obtain user input
		invoice1.setPartNumber(partNumber); // Add to invoice1 partNumber
		
		
		System.out.print("Enter the Part Description of the Sold Item:"); // propmt
		String partDescription = input.nextLine(); // obtain user input
		invoice1.setPartDescription(partDescription); //Add to invoice1 partDescription
		
		
		System.out.print("Enter the Quantity Item of the Sold Item:"); // propmt
		int QuantityItem = input.nextInt(); // obtain user input
		invoice1.setQuantityItem(QuantityItem); // Add to invoice1 QuantityItem
		
		
		System.out.print("Enter the Price per Item of the Sold Item:"); // propmt
		double pricePerItem = input.nextDouble(); // obtain user input
		invoice1.setPricePerItem(pricePerItem); // Add to invoice1 pricePerItem
		
		
		// Again Display Invoice1
		System.out.printf("%ninvoice1 Part Number is %s.%n",
			invoice1.getPartNumber());
			
		System.out.printf("invoice1 Part Description is %s.%n",
			invoice1.getPartDescription());
			
		System.out.printf("invoice1 Quantity is %d.%n",
			invoice1.getQuantityItem());
			
		System.out.printf("invoice1 Price Per Item is %.2f.%n",
			invoice1.getPricePerItem());
			
		System.out.printf("Your Total Amount is  %.2f%n",
			invoice1.getInvoiceAmount());
			
			
		
	} // end main method
} // end class Invoice