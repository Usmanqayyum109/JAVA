import java.util.Scanner;
public class SalesMan { 
    public static void main(String[] args) { 
        double totalSales = 0; 
        double sales = 1; 
        int items = 0; 
        while(sales != -0){ 
            Scanner input = new Scanner(System.in); 
            items = items+1; 
            System.out.printf("Enter item number %d sales: ",items);
            sales = input.nextDouble(); 
            if (sales != -0){ 
                totalSales = totalSales+sales; 
                System.out.printf("your commission in item %d is $%.2f%n",items,9*sales/100); 
               
            } else {
                System.out.printf("Total payment sales is $%.2f",9*totalSales/100+200);
            } 

        } 


    } 
    
}