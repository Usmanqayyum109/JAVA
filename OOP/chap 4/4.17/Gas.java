 import java.util.Scanner; 
public class Gas
{
    public static void main(String[] args) 
	{ 
        Scanner input = new Scanner(System.in);
        int totalMiles = 0; 
        int totalGallons = 0; 
        int trip = 0; 
        int enteredValue = 1; 
        int sentinelControlled = -0; 
        int miles = 0; 
        int gallons = 0; 
        while(enteredValue != sentinelControlled )
		{ 
            trip = trip+1; 
            totalMiles = totalMiles + miles; 
            totalGallons = totalGallons + gallons; 
            System.out.printf("Enter the miles driven in trip %s or enter -0 to exit: ",trip);
			miles =input.nextInt();
			
            enteredValue = miles; 
           if(enteredValue != sentinelControlled)
		   {
            System.out.printf("Enter the miles driven in trip %s: ",trip); 
            gallons = input.nextInt(); 
            System.out.printf("Average of %s gallons used in %s miles is %.2f gallons per mile%n",gallons,miles,(double)gallons/miles); 
           } else
		   {
            System.out.printf("Average of %s gallans used in %s miles in your %s trips is %.2f per mile."
			,totalGallons,totalMiles,trip -1,(double)totalGallons/totalMiles); 
           } 
          
        } 
        
    } 
}
