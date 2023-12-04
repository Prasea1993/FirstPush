package programs;

public class Human {
	
	
	public int numOfLegs;
	public int numOfhands;
	public boolean litertare;
	public double sscPercentage;
	public static boolean verifyCanEat;
	
	
	
	public boolean canWalk() {
		
		return true;
	}

	
	// private >> protected >>  >> public
	
	// is -a relation ship
	
	// class object 
	
	// Human ===> prasghanth
	
	// Prashanth is a human
	// 
	
	
	public static void main(String[] args) {
		
		
		Human prashanth=new Human();
		
		prashanth.numOfhands=3;
		prashanth.numOfLegs=4;
		prashanth.litertare=false;
		prashanth.sscPercentage=0.00;
		
		
		verifyCanEat=true;
		
		Human subhash=new Human();
		subhash.numOfhands=2;
		subhash.numOfLegs=2;
		subhash.litertare=true;
		subhash.sscPercentage=90.23;
		
		System.out.println();
		
		
		
	}
	
	
	
	
	
	

}
