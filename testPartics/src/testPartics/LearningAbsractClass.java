package testPartics;


 abstract class AAAA{
	 AAAA(){}
	public  abstract void sum() ;
}

public   class LearningAbsractClass extends AAAA{
	final int i=23;

	public LearningAbsractClass() {}
	
	public  void sum() {
		System.out.println("xfcsd");
		
	}
	public final void add() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		LearningAbsractClass a = new LearningAbsractClass();
		a.sum();
		}
		
	}
final class  BBBBB extends LearningAbsractClass{
	
}

	


