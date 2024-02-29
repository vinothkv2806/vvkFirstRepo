package firstJavaProject;

/**
 * @author Administrator
 *
 */
public class MotorBikes {
	//state
	private int speed; //member variable
	
	//behaviour
	//input - int Speed
	//output - void
	//name - setSpeed
	
	void setSpeed(int speed) {
		//local variable
		System.out.println(speed);
		System.out.println(this.speed);
	}
	int getSpeed() {
        return this.speed;																																
	}		
	void start() {
		System.out.println("Bike Started");
	}
	

}
