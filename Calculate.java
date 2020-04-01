import java.util.*;
class Age {
//The method calculatsonage is used to calculate the age of the future male_child
void calculatsonage(int Hmother,int Hfather) {
int male_child;
male_child = ((Hmother * 13/12) + Hfather)/2;  //formula for calclutaing mail child
System.out.println("Your future child is estimated to grow to"+" "+male_child+" "+"inches"); //Printing the values
}
//The method calculatsonage is used to calculate the age of the future female_child
void calculatdaughterage(int Hmother,int Hfather) {
int Hfemale_child;
Hfemale_child = ((Hfather * 12/13) + Hmother)/2;  //formula for calclutaing female child
System.out.println("Your future child is estimated to grow to"+" "+Hfemale_child+" "+"inches"); //Printing the values
}
}
class Calculate {
public static void main(String args[]) {
int Hmother,Hfather,H_choice; 
char ch;
Scanner in=new Scanner(System.in); //Scanner class to take inputs
Age a=new Age(); // Creating the object of Age class to call the methods under Age class 
do {
System.out.println("Enter the gender of your future child. Use 1 for female, 0 for male");
H_choice=in.nextInt(); // Taking the input choice whther user wants to select 1 for female or 0 for male

if(H_choice==1) {
System.out.println("Enter the height in inches of the mom.");
Hmother=in.nextInt();
System.out.println("Enter the height in inches of the dad.");  /*It will take the inputs of H_Father and H_Mother and call the method calculatdaughterage for female child*/
Hfather=in.nextInt();
a.calculatdaughterage(Hmother,Hfather);
}
else if(H_choice==0)
{
System.out.println("Enter the height in inches of the mom.");
Hmother=in.nextInt();/*It will take the inputs of H_Father and H_Mother and call the method calculatsonage for mail child*/
System.out.println("Enter the height in inches of the dad.");
Hfather=in.nextInt();
a.calculatsonage(Hmother,Hfather);
}
System.out.println("Enter 'Y' to run again, anything else to exit.");
ch = in.next().charAt(0);
}while(ch=='Y'); // using do while loop for asking the user choice untill he exits the programs
}
}