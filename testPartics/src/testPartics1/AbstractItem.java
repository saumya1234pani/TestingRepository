package testPartics1;

import java.util.ArrayList;

public class AbstractItem {

	public static void main(String[] args) {
		
		int k = ThisIsAbstractClass.st;
		int q = ThisIsAbstractClass.sum(4, 5);
	}

}

 class ThisIsAbstractClass extends THisismySecondClass{
	static int st=20;
	public static int sum(int i,int j) {
		return (i+j);
	}
	 int add() {return 7;}
}
abstract  class THisismySecondClass {
	THisismySecondClass(){}
	THisismySecondClass(int i){}
	abstract int add();
	public int sam() {
		return 5;
	}

}
