//Base class Person which defines student firstname and lastname
class Person {  
    String firstname,lastname; //instance variables firstname and lastname
//Getdetails1 method will get the values of first and last name of students from main method
    void Getdetails1(String Firstname,String Lastname) {
        firstname=Firstname;
        lastname=Lastname;
    }
//displayDetails will display the student first and last name
    void displayDetails() {
        System.out.println(firstname+" "+lastname);
    }
}
class Student extends Person {
//extend Person class from Stduent to get student first and last name.
    int StudentID; //instance variables studentid
    String course,teachername; //instance variables course,teachername
//Getdetails2 will get the values of student id,course,teacher
    void Getdetails2(int sid,String courses,String teacher) {
        StudentID=sid;
        course=courses;
        teachername=teacher;
        
    }
//displayDetails() will display the details of student
    void displayDetails() {
        System.out.println("The firstname of the Student "+firstname);
        System.out.println("The lastname of the Student "+lastname);
        System.out.println("The Student id of the Student "+StudentID);
        System.out.println("The course is "+course);
        System.out.println("The teachername is "+teachername);
}
}
class Teacher extends Person {
    String subjectname; //instance variable subjectname
    int salary; //instance variable salary
//Teacher constructor to define subject and sal 
    Teacher(String subject,int sal) {
        subjectname=subject;
        salary=sal;
    }
//displayDetails() to display the details of teacher subjectname and salary
    void displayDetails() {
        System.out.println("The teacher teaches "+subjectname);
        System.out.println("The salary for the teacher is "+salary);
}
}
public class Tester
//Main class tester to call all the student and teacher class
{
	public static void main(String[] args) {
		Student s=new Student(); //Create an object of student class
		s.Getdetails1("N","Rahul");//pass the values to Person class
		s.Getdetails2(12,"BTech","Prasad"); //Pass the values to student class
		s.displayDetails();//display the student class display method
		Teacher t=new Teacher("Maths",30000); //Create a teacher class object
		t.displayDetails();//display the teacher class displaymethod
		s.Getdetails1("N","Suresh");
		s.Getdetails2(14,"BTech","krishna");
		s.displayDetails();
		Teacher t1=new Teacher("Science",40000);
		t1.displayDetails();
	}
}