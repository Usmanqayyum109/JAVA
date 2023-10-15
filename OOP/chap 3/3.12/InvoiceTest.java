public class InvoiceTest
{
	public static void main(String[]args)
	{
		Invoice invoice1 = new Invoice("o93d611","good",80,20.00);
		
		System.out.printf("Total amount is:$%.2f",invoice1.getInvoiceAmount());
	}
}