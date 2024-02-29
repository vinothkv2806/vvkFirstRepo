package firstJavaProject;

public class Book {
	
	//state
		private int noOfCopies; //member variable
		
		//behaviour
		//input - int Speed
		//output - void
		//name - setSpeed
		
		void setNoOfCopies(int noOfCopies) {
			//local variable
			System.out.println(noOfCopies);
			System.out.println(this.noOfCopies);
		}
		int getNoOfCopies() {
	        return this.noOfCopies;																																
		}		
		void startRead() {
			System.out.println("Book start reading");
		}
		
																																																												
}
