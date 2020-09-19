package testPartics;


class XYZ{
	public static int sum() {return 0;}
}

class Derived  

{ 
	String s ="dfcxf";
	int i = 0;
	int j=20;
	
	
	
	
	
	
	
	

    public void getDetails() throws Throwable //line 23 
    { 
    	s = s.toUpperCase();
        System.out.println("Derived class"); 
    } 
} 
  
public class Test extends Derived 
{ 
    public void getDetails() throws Exception //line 24 
    { 
        System.out.println("Test class"); 
        Derived d = new Derived();
        
        int i=10;
        System.out.println(i);
    } 
    Test(int i){}
    public static void main(String[] args) throws 
Throwable
    { 
        Test obj = new Test(10); 
        obj.getDetails(); 
    } 
} 
