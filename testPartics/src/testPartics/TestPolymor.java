package testPartics;
class A{
	public A(){System.out.print("XYZ ");}

	public void sum() {
	System.out.println("A");}
}
class B extends A{
	B(){
	}
	public void sum() {
	System.out.println("B");}
	public void add() {
		System.out.println("Add");
	}

}

public class TestPolymor {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		a.sum();
		b.sum();
	
	} 

}
