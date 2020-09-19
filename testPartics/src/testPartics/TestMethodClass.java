package testPartics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethodClass t = new TestMethodClass();
		//t.sum(20, 34);
		t.sum(20, 20);
		ssa();
		List l = new ArrayList<>();
		System.out.println(l.size());
		l.add("dsdf");
		l.add(4);
		l.add('f');
		System.out.println(l);
		l.remove("dsdf");
		
		System.out.println(l);

	}
	public void sum(int i ,double f) {
		System.out.println("int,float");
	}
	public void sum(float f,double i) {
		System.out.println("float,in1");
	}

	public static void su() {
		int i =10/0;
	}
	public static void ssa() {
		try {
		File f = new File("");
FileInputStream fis = new FileInputStream(f);}
		
		catch(FileNotFoundException e1) {
			
			//;
			//e1.printStackTrace();
			
			System.out.println(e1.getMessage());
		}

		
	
	}
	


}
