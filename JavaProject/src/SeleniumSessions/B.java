package SeleniumSessions;

public class B extends A {

	public B() {
		super();

	}

	public B(int i) {
		super(i);

	}

	public B(int i, int j) {
		super(i, j);

	}

	public B(int i, int j, int k) {
		super(i, j, k);

	}

	public B(int i, int j, int k, int l){
		super(i, j, k, l);
	}
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
		B obj3 = new B(10, 20, 30);
		B obj4 = new B(10, 20, 30, 40);
		

	}
}
