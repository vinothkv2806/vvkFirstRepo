package firstJavaProject;

public class BookRuner {
	
	public static void main(String[] args) {
		Book effactiveJava = new Book();
		Book cleanCode = new Book();
		
		effactiveJava.startRead();
		cleanCode.startRead();
		
		effactiveJava.setNoOfCopies(10);
		System.out.println(effactiveJava.getNoOfCopies());
		
		cleanCode.setNoOfCopies(10);
		System.out.println(cleanCode.getNoOfCopies());
		
	}

																																																														}
				
								
																	