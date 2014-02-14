
/*-----------The SUUUUUPER CLASSSSSSSSSSSSSSSSSSS---------- */
public class bicycle {
	
	// the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    
    /*---------------The derived/child class/subclass------------------- */
    public class MountainBike extends bicycle {
            
    	    // the MountainBike subclass adds one field
    	    public int seatHeight;

    	    // the MountainBike subclass has one constructor
    	    public MountainBike(int startHeight,
    	                        int startCadence,
    	                        int startSpeed,
    	                        int startGear) {
    	        super(startCadence, startSpeed, startGear);
    	        seatHeight = startHeight;
    	    }   
    	        
    	    // the MountainBike subclass adds one method
    	    public void setHeight(int newValue) {
    	        seatHeight = newValue;
    	    }
    }

}

// QUESTION about super():
/* ----------------------Super class----------------------
 * class bicycle {
 * 
 * 		int gear;
 * 
 * 		bicycle(int initialGear) {
 * 			gear = initialGear;
 * 		}
 * 		
 * 		__________________Sub class_______________________
 * 		public class MountainBike extends bicycle {
 * 			int seatHeight;
 * 			super(initialGear); <-------- Does this initialize the 
 * 										  inherited data member to a 
 * 										  default value??
 * 		} 
 * }
 * 
 */