package testPartics1;

public class TestInterface implements l1,l2,l3 {

	public void sum(){
		
	}
	public void add() {}
	public void minus() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(l1.f);
	}

}

interface l1 {
	 public static final int f = 6;
	 void sum();
}
interface l2 extends l1{
	 public static final int f = 6;
	 void add();
}
interface l3{
	 public static final int f = 6;
	 void minus();
}

class Ao{
	
}
class Bo{}
