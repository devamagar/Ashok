package Boolean;

public class Boolean { 
	
	public static void main(String args[]) {
     boolean passedDoor=true;
     boolean missedDoor=false;
     boolean passedAlDoors=false;
     boolean missedAlDoors=true;
     int doorcount=0;
	if(passedDoor) {
		System.out.println("we passed in the first door");
		doorcount= doorcount=+1;
	}
	if(missedDoor) {
		System.out.println("we passed in the second door");
		doorcount= doorcount=+1;
	}
	if(passedDoor) {
		System.out.println("we passed in the third door");
		doorcount= doorcount=+1;
		
		if (doorcount==3) {
		passedAlDoors = true;
		}			
	}

}}