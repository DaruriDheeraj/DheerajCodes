import java.util.Scanner; //importing Scanner class from Utill package
public class Project1
{
	public static void main(String[] args) {
	double Result,Aus_Cur; // Declare Two variables Result for storing the out and Aus_Cur for taking input
	Scanner in =new Scanner(System.in);
	System.out.println("Enter n value");
	Aus_Cur=in.nextDouble(); // Taking input as Double
	Result=Aus_Cur*9.91; //Convert Aus Dollars into South African Rand
	System.out.println("AUD"+Aus_Cur+"is worth"+"ZAR"+Result); // Displaying the output
	
	}
}