package firstJavaProject;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBikes ducati = new MotorBikes();
		MotorBikes honda = new MotorBikes();
		
		ducati.start();
		honda.start();		
 
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		
		honda.setSpeed(20);
		System.out.println(honda.getSpeed());
		
		
	}

}
