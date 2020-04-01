import java.util.*;
class Student {
String firstname,lastname;
int studentID;
//Creating a student constructor  to initialise the instance variables
Student(String firstname,String lastname,int studentID) {
this.firstname=firstname; //initialise firstname of the student
this.lastname=lastname;    //initialise lastname of the student 
this.studentID=studentID; //initialise studentID
}
public String getFirstname() {
    return firstname; //get the firstname of the student
  }
  
public void setFirstname(String firstname) {
this.firstname=firstname; //set the firstname of the change getter using 
}

public String getLastname() {
 return lastname; //get the lastname of the student using getter method 

}
public void setLastname(String lastname) {
this.lastname=lastname; //set the lastname of the student using setter method
}

public int getStudentID() {
return studentID; //get the studentID using getter method 
}

public void setStudentID(int studentID) {
this.studentID=studentID;  //set the studentID using setter id 
}
//The method is used to return the firstname,lastname and studentID as string
public String toString() 
    { 
        return "The student Firstname is " + firstname +"\n" +"The Student lastname is " + lastname + "\n" +"The Student ID is "+ studentID; 
    } 
}

class StudentTester {
public static void main(String args[]) {
String firstname,lastname;
int studentID,ch;
Scanner in=new Scanner(System.in); //Scanner class to take input from user 
System.out.println("Enter the deails");
/*Creating the three variables firstname,lastnameand studentID and taking inputs from user*/
System.out.println("Enter the student firstname");
firstname=in.next();  
System.out.println("Enter the student lastname");
lastname=in.next();
System.out.println("Enter the student ID");
studentID=in.nextInt();
Student s=new Student(firstname,lastname,studentID);
do {
System.out.println("1) Display the details");
System.out.println("2) Change the firstname");
System.out.println("3) Change the lastname");
System.out.println("4) Change the student ID");
System.out.println("5) Exit");
System.out.println("Enter your choice");
ch=in.nextInt();
switch(ch) {
case 1:
System.out.println(s.toString()); //Display the details
break;
case 2:
//Change the firstname of the student
String first_change;
System.out.println("Enter the student firstname you want to change");
first_change=in.next(); //taking user input to change the firstname
s.setFirstname(first_change);
System.out.println("The name changed to "+s.getFirstname()); //printing the value
break;
case 3:
System.out.println("Enter the student lastname you want to change");
String last_change; 
last_change=in.next(); //taking user input to change the lastname
s.setLastname(last_change);
System.out.println("The name changed to "+s.getLastname()); //printing the value
break;
case 4:
int studentID1;
System.out.println("Enter the student ID you want to change");
studentID1=in.nextInt(); //taking user input to change the studentID
s.setStudentID(studentID1);
System.out.println("The student number chnaged to"+s.getStudentID()); //Printing the value
break;
}
}while(ch!=5);
}
}