package testPartics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class NewStrClass {

	public static void main(String[] args) {
		String s = "Saumya";
		;
TreeSet t = new TreeSet<>(new TestComparator());
t.add(10);
t.add(20);
t.add(5);
t.add(5);
System.out.println(t);
Map m = new HashMap<>();
m.put(1, "Saumya");
m.put(3, "Sonu");
m.put(5, "Saumya");
m.put(null, null);
m.put(null, "fddfd");


System.out.println(m);


	}}

 class TestComparator implements Comparator<Object> {

	

	@Override
	public int compare(Object o1, Object o2) {
Integer i1 = (Integer)o1;
Integer i2 = (Integer)o2;
return -i1.compareTo(i2);
//if(i1>i2)
//	return -1;
//else if(i1<i2)
//	return +1;
//else
//	return 0;
	}}
