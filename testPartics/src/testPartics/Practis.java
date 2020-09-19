package testPartics;

class AA{
public AA() {
System.out.println("This is for AA");//this(),super()
}
	int i =10;
}

//=============================
class BB extends AA {
	
	
	public BB(int i) {
		this(43,43);
		System.out.println("THis is for BB with int");
			}
	public BB(int i,int j) {
		System.out.println("THis is for BB with int 2 param");
			}
	int i=super.i;
	//this()
}
//===============================

public class Practis extends BB{
	int j=20;
	
	public Practis(int i) {
		super(i);
		System.out.println("int");
}
	public Practis(int i,int f,int ds) {
		this(45);
		System.out.println("int with 3");
}



	

	public static void main(String[] args) {
		BB p = new BB(3434);
	//	p.tres();
		
	}
	public void tres() {
		int j=10;
		System.out.print(super.i);
		
	}

}

//A<----B<---P
