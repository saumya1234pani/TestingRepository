package testPartics;

public class SingleTonClass {
	
	public static void main(String ...a) {
		
		MainClass m = MainClass.MainClassMethod();
		MainClass m1 = MainClass.MainClassMethod();
		//MainClass d = new MainClass(10);
		//MainClass d1 = new MainClass(10);
		//MainClass m = MainClass.check(10);
		//MainClass m1 = MainClass.check(10);

		//System.out.println(m);
		//System.out.println(m1);

	}



}
class MainClass {
	
	
	private static int i=10;
    private static MainClass single_instance = null; 
    private MainClass(int i) {
    	System.out.println("this is hi");
    }
    public static MainClass check(int i) {
    	return new MainClass(i);
    }

	private  MainClass() {

		System.out.println("1");
	}
	
	public static MainClass MainClassMethod() {

		 { 
		        if (single_instance == null) {
		            single_instance = new MainClass(); }
		  
		        return single_instance; 
		    } 

}
	public void sum() {
		
	}
}
