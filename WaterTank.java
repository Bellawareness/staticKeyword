
public class WaterTank {


		  // Finish the WaterTank class

		  // 1. Create a static variable that takes a value for the waterlevel.

	public static int waterLevel= 100;
	 
		  // A constructor that initializes the waterlevel variable
		    public  WaterTank(){
		      int waterLevel = 100
		    		  ;
		    }

		  // 2. Create a method called useWater() that uses some water and reduces the waterlevel amount by 10 units. Make it print out the following string: "Water gushes". If there is no water then print out the following string instead: "No water. Please refill" and do not reduce the waterlevel. 

 void useWater(){


if (waterLevel == 0) {
				System.out.println("No water. Please refill");
}
  else if (waterLevel< 80) { 				

				System.out.println("No water. Please refill" );}

		 else {
		      System.out.println("Water gushes");
		      waterLevel -= 10;
		 }
 }
		  // 3. Create a method calld refill() to refill the waterlevel to its maximum amount. Make it print out the following strings: "Watertank is being refilled" and then on the next line: "Watertank is full". 

		 public void refill(){
			 
				System.out.println("Watertank is being refilled");
						System.out.println("Watertank is full" );
			      waterLevel = 100;

		 }
		  // 4. Create a method to print out the waterlevel called printWaterLevel(). Use the following string: "Water level: " and then the waterlevel variable.
		 public void printWaterLevel(){

		System.out.println("Water level: " +   waterLevel);
		 
		
		}
		


}
