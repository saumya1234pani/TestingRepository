package testPartics1;

public class Testing123 {

	public static void main(String[] args) {
		TestImmutable t1 = new TestImmutable(10);
		TestImmutable t2 = t1.modityValue(100);
		TestImmutable t3 = t1.modityValue(10);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}

final class TestImmutable{
	private int i;
	TestImmutable(int i){
		this.i = i;
	}
	public TestImmutable modityValue(int i) {
		if(this.i ==i) {
			return this;
		} else {
			return (new TestImmutable(i));
		}
	}
}