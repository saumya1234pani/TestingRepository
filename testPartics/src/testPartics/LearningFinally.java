package testPartics;

public class LearningFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("dsfss");
			System.exit(0);
			int i = 10/0;
			
			
		} catch (Exception Ex) {
			System.out.println("this is catch");
}
		finally {
			System.out.println("Hi this is db closed");

		}
	} 

}
