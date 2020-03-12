import java.util.Scanner; //importing Scanner class to take input
import java.util.Random; //Importing random class to generate random numbers
public class Project2
{
	public static void main(String[] args) {
	int num,min_val,max_val,Rand_num,Small_num,diff_result; 
	String Sentence,replace_word;
	Scanner in =new Scanner(System.in);
	System.out.println("Please enter a whole number");
	num=in.nextInt(); // Taking an integer as input and storing it in num
	in.nextLine(); /* call nextline() method for taking string as input after calling nextInt input 
	if we don't call nextLine method then System will skip the Sentence input string after calling nextint method*/
	System.out.println("You just entered"+" "+num); // Printing the whole number 
	Random rand = new Random(); // Calling creating object for Random class
	min_val=20;
	max_val=40;
	Rand_num=rand.nextInt((max_val-min_val)+1)+min_val; // Taking random numbers from 20 to 40 and storing in Rand_num
	/*min_val=20 and max_val=40
	(40 - 20) + 1) + 20
	(20)+1)+20
	(21)+20 [0..20]+20 [20..40]
	*/
	System.out.println(Rand_num); // Print the Random numbers
	if(num<Rand_num) {
	    Small_num=num; /* if num is less than Rand_num then we will print num*/
	    System.out.println("The Smallest number is"+" "+Small_num);
	}
	else {
	    Small_num=Rand_num; //if num is greater than Rand_num then we will print Rand_num
	    System.out.println("The Smallest number is"+" "+Small_num);
	}
	if(num<Rand_num) {
	 diff_result=Rand_num-num; //if num is less than Rand_num then we will find diff between Rand_num and num
	 
	 System.out.println("The difference of the two numbers is"+ " "+diff_result); 
	}
	else {
	   diff_result=num-Rand_num; //if num is greater than Rand_num then we will find diff between num and Rand_num
	   System.out.println("The difference of the two numbers is"+ " "+diff_result);
	}
	System.out.println("Enter a Sentence that include the word like");
	Sentence=in.nextLine(); // Taking a Sentence as input 
	Sentence.toLowerCase();
	/*Converting each word to lower case incase if the letter be capital 
	Example:
	LIKE 
	Sentence.toLowerCase() will convert into like
	*/
	replace_word=Sentence.replace("like","dislike");
	/*replace method is used to replace mached word with new one 
	Example: I like Shopping
	Sentence.toLowerCase() will convert the word into i ike shopping
	Sentence.replace("like","dislike") //will replace like with dislike
	*/
	System.out.println("The Resulting String is "+replace_word.toUpperCase()); // Print the string in upper case by calling toUpperCase() method
	}
}