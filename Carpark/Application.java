import java.util.*;
/**
 * Write a description of class Application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Application
{
	public static void main(String[] args) {
	    
	    String parkingslotID,Find_slot,slotId,carregistration,slotID1,carreg;
		int ch,parkingslotnumber,parksize=20,parkingslots,parkid=0,y,c=0,parksnum=0,newparkslot; //Intialize a varialbes
	   Scanner in =new Scanner(System.in); // Define a Scanner class to take inputs
	  ParkCarDetails p[]=new ParkCarDetails[parksize]; //Declare a Array of object class with size max 20
	  
	  /* Using do-while and switch cases to Ask the user to 
	   1.Create a Parking SLot, Find a Car, Remove a Parking slot, Insert a parking slot mulitple until the user quits the program*/
      do {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. Add a Park Slot along with Car registration number");
        System.out.println("2. Remove a slot number if Car is empty");
        System.out.println("3. Dispay the slot along with details");
        System.out.println("4. Find the Car registaration number"); 
		System.out.println("5. Insert a new Car into a slot");
		System.out.println("6. Delete a Car in a Slot");
		System.out.println("7. Press 7 for EXIT");
        System.out.println("Enter your choice");
        ch=in.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		//c=s.Countvalue();
		switch(ch) {
			case 1:
			/* Creating a Parking Slot */
              System.out.println("How many parking slots you want to allocate? please input as integer"); 
              parkingslots=in.nextInt(); //Taking the total number of parking slots to be allocated form user 
				parkid=parkid+parkingslots; //Intially adding the total parking slots size with zero
				for(int i=parksnum;i<parkid;i++) {
                   p[i]=new ParkCarDetails(); // Creating total parking objects based on input and assiging a parksoltID 
			     p[i].AddDetails(); //This method is used to allocate the Parkslot ID
				}
			    parksnum=parkid; // Assiging the value of parking slot size to parksnum so that when user creates an another slots indexing starting from the last parking slot
				break;
		     case 2: 
			 boolean carfound=false,slotfound=false;
			 //Deleting a Parking Slot 
                 System.out.println("Please enter the parking slot ID you want to delete"); 
                 Find_slot=in.next(); 
				 y=parkid;
				 for(int i=0;i<y;i++) {
			   
				 slotfound=p[i].searchSlot(Find_slot); //To check whether Park slot is present or not
				 if(slotfound) {
					 carfound=p[i].SearchCar(); //In SearchCar method we are checking whether the Car Registartion number is present under parking slot or not		 
				 if(carfound) {
					p[i].deleteSlot(); //If Car is slot is empty 
				   break;
				 }
				 break;
				 }
		}
				 if(!slotfound) {
					 System.out.println("There is no such slot"); //If there slot print there is no sych slot
					 System.out.println("----------------------------------------------------------------");
					 break;
				 }
				 if(!carfound) {
				 System.out.println("There is a car occupied in that slot"); //If there is car occupied then print there is car occupied 
				 System.out.println("----------------------------------------------------------------");
				 break;
				 }
		        break; 
		     case 3:
			 y=parkid;
			 boolean found5=true;
          for(int i=0;i<y;i++) {
			  found5=p[i].FindEmptySlots();
			  if(found5) {
		  p[i].display();
		  }
		  }
		     break;
		     case 4:
			 System.out.println("Enter the Car registration number you want to search"); 
             slotId=in.next();
		     y=parkid;
			 boolean found2=false;
			 for(int i=0;i<y;i++) {
		      found2=p[i].SearchCarbyID(slotId); //This method is used to search the car registration number 
		      if(found2) {
				  p[i].display(); //Calling the Display method the car detials when found
				  System.out.println("----------------------------------------------------------------");
				  break;
			 }
			 }
			 if(!found2) {
			 System.out.println("The Mentioned park slot id "+" " +slotId+" "+"is not present");
			 System.out.println("----------------------------------------------------------------");
			 break;
			 } 
		  break;
	    case 5:	
		   System.out.println("Enter the Parking slot number id where you want to park");
	    slotID1=in.next();
	y=parkid;
		boolean found3=false,found4=false;
		for (int i=0;i<y;i++) {
		found3=p[i].searchSlot(slotID1); //Intially checks whether the Parking Slot is present or not 
		if(found3) {
		  found4=p[i].SearchCar(); //Check whether any Car is occupied under the slot 
		  if(found4) {
			  try {
			int cou=0;
		   System.out.println("Enter the Car registaration number "); //If no car is occupied under parking slot park that car under the slot
	    carregistration=in.next();
		/*Checks the input mentioned by the user follows the belows
	                                        1. An UpperCase followed by 4 digits for ParkingSlotID*/
		while(cou==0) {
	if(carregistration.length()<=4 && carregistration.length()>6) {
		System.out.println("Enter the Input properly it should be less than 5");
		cou=1;
		break;  
	}
	else {
	 char ch3=carregistration.charAt(0);
	 char ch4=carregistration.charAt(1);
	 char ch5=carregistration.charAt(2);
	 char ch6=carregistration.charAt(3);
	 char ch7=carregistration.charAt(4);
	 if (ch3 >= 'A' && ch3 <= 'Z' && ch4>='0' && ch4<='9' && ch5>='0' && ch5<='9' && ch6>='0' && ch6<='9' && ch7>='0' && ch7<='9') {
	System.out.println("Input is Correct Lets Proceed");
		  p[i].AddCarDetailsinslot(carregistration);
		  cou=1;
		  break;
	 }
		  }
		}
		}
		catch(Exception e) {
			System.out.println("Please Specify the Input correctly");
		}
		break;
		  }  
	break;
	 }
	 
}
if(!found3) {
			System.out.println("There is no such slot present "+" "+slotID1); //If not slot found print no slot found
			System.out.println("----------------------------------------------------------------");
			break;
		}
if(!found4) {
			  System.out.println("The car Slot is already occupied under "+" "+slotID1); //if car is occupied under the slot then print car is occupied.
			  System.out.println("----------------------------------------------------------------");
			  break;
		  }		
		 break;
		case 6:
		//Delete a Car 
		    System.out.println("Enter the Car Registration Number");
			carreg=in.next();
			y=parkid;
			boolean found6=false;
			for(int i=0;i<y;i++) {
				found6=p[i].FindCar(carreg); // The method FindCar checks whether the Car is present or not.
				if(found6) {
			    p[i].deleteCar(carreg); //Delete a car if found
				break;
				}
			}
			if(!found6) {
			System.out.println("The mentioned Car is not present"); //If Car is not found print car is not present
			break;
			}
			break;
		}
	}
	  while(ch!=7);
	}
}