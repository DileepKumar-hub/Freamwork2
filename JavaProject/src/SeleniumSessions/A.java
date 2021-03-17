package SeleniumSessions;

public class A {

	public A() {
		System.out.println("parent class const");
		System.out.println("*****");
	}

	public A(int i) {
		System.out.println("parent class const with value of i " + i);
		System.out.println("*****");
	}

	public A(int i, int j) {
		System.out.println("parent class const with value of i " + i);
		System.out.println("parent class const with value of j " + j);
		System.out.println("*****");

	}

	public A(int i, int j, int k) {
		System.out.println("parent class const with i " + i);
		System.out.println("parent class const with j " + j);
		System.out.println("parent class const with k " + k);
		System.out.println("*****");
	}
	
	public A(int i, int j, int k, int l){
		System.out.println("parent class const with i "+ i);
		System.out.println("parent class const with j "+ j);
		System.out.println("parent class const with k "+ k);
		System.out.println("parent class const with l "+ l);
		System.out.println("*****");
	}
}
