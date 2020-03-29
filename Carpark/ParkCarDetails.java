import java.util.*;
/**
 * Write a description of class ParkCarDetails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParkCarDetails
{
	String ParkingSlotID,cardetails,Staffing_Info,Carno,parkingslotID1; //initilzaion gobal variables 
	char ch1;
	Scanner in=new Scanner(System.in); // Taking inputs from Scanner Class 
void AddDetails() { // Add the Details for Parkin Slot method                                            
	int cou=0;
	System.out.println("Enter the Parking slot number");                     
    ParkingSlotID=in.next(); // Taking the ParkingSlot ID as input 
	while(cou==0) {
	if(ParkingSlotID.length()<=2 && ParkingSlotID.length()>4) {
		cou=1;
		System.out.println("The Input properly it should be less than 3");
		break;
	}
	if(ParkingSlotID.length()==3) {
	 char ch3=ParkingSlotID.charAt(0);
	 char ch4=ParkingSlotID.charAt(1);  /*Checking the input mentioned by the user follows the belows
	                                        1. An UpperCase followed by 2 digits for ParkingSlotID
											*/     
	 char ch5=ParkingSlotID.charAt(2);
	 if (ch3 >= 'A' && ch3 <= 'Z' && ch4>='0' && ch4<='9' && ch5>='0' && ch5<='9') {
		 cardetails="EMPTY";
	Staffing_Info="EMPTY"; // initilzing both Cardetails and Staff info as empty for slots.
	//System.out.println("Input is Correct Lets Proceed");
	cou=1;
	 }
}	 
	}
	}                          
void deleteSlot() {
ParkingSlotID=ParkingSlotID.replaceAll(ParkingSlotID, "EMPTY"); // Method to remove the ParkingSlot
}
/* Displaying the Details Parking Slot, Car Registration number and Staff*/
void display() {
	if(cardetails=="EMPTY") {   //Prints only the ParkingSlotID as there is no Car Slot allocated in it
System.out.println("=================================================================="); 
System.out.println("The Parking Slot ID is" +" "+ ParkingSlotID);
	}
	else {
	System.out.println("==================================================================");
System.out.println("The Parking Slot ID is" +" "+ ParkingSlotID); //Prints the ParkingSlot and Car Registartion number and Staff details
System.out.println("The Car registration number for slotID"+"  "+ParkingSlotID +" "+"is"+" "+ cardetails);
System.out.println("The Staff is"+"  "+Staffing_Info);
}
}
/*Checks whether the slot is present or not*/
boolean searchSlot(String Slotnumber) {
	if(ParkingSlotID.equals(Slotnumber)) {
		//System.out.println(ParkingSlotID);
		return true;
	}
else {
return false;
}
}
boolean SearchCar() {
	if(cardetails.equals(cardetails) && cardetails.equals("EMPTY")) {
	 return true;
	}
	else {
		return false;
}
}
/*boolean SearchParkingSlot(String SlotID) {
	if(ParkingSlotID.equals(SlotID)) {
	   return true;
	}
	else {
		return false;
}
} */

// The method AddCarDetailsinslot is used to add the Car along with vehicle owner based on user input
void AddCarDetailsinslot(String carregistration1) {
cardetails=cardetails.replaceAll("EMPTY",carregistration1);
System.out.println("Press 1 if he/she is a visitor or press 2 if he/she is a staff");
int ch2=in.nextInt();
if(ch2==1)
Staffing_Info="Visitor";
else if(ch2==2)
	Staffing_Info="Staff";
else 
	System.out.println("Please enter the input properly");

}
//The FindEmptySlots is used to check any empty slots 
boolean FindEmptySlots() {
	if(ParkingSlotID.equals("EMPTY")) {
return false;
}
else {
return true;
}
}
//The method deleteCar is used to Delete a Car
void deleteCar(String carreg1) {
cardetails=carreg1.replaceAll(carreg1,"EMPTY");
Staffing_Info=Staffing_Info.replaceAll(Staffing_Info,"EMPTY");
}
//This method is used to check whether a car is present or not
boolean FindCar(String carreg) {
if(cardetails.equals(carreg)) {
	return true;
}
else {
	return false;
}
}
//This method is used to check whether the car is empty or not
boolean SearchCarbyID(String Carregnum1) {
if(cardetails.equals(Carregnum1)) 
	return true;
else 
	return false;
}
}