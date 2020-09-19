package testPartics;

public class KeywordsLearning {
	
	static int i = 10;
	int j= 12;

	public static void main(String[] args) {
		KeywordsLearning k = new KeywordsLearning();
		KeywordsLearning k1 = new KeywordsLearning();
		System.out.println(k.j);//-->12
		System.out.println(k1.j);//-->12
		System.out.println(k.i);//-->10
		System.out.println(k1.i);//--->10

		k.j = 10;
		k.i=50;
		System.out.println(k.j);//-->10
		System.out.println(k.i);//--->50
		k1.j=20;
		k1.i=100;
		System.out.println(k.j);//-->10
		System.out.println(k1.j);//--->20
		System.out.println(k.i);//---->100
		System.out.println(k1.i);//---->100



	}
	public void test() {
	}

}
