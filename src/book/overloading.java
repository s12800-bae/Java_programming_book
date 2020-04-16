package book;

public class overloading {
	void A () {System.out.println("void a()");}
	void A (int arg1) {System.out.println("void a(arg1)");}
	void A (int param1) {System.out.println("void a(arg2)");}
	void A (String arg1) {System.out.println("void a(String arg1)");}
	public static void main(String[] args) {
		overloading od = new overloading();
		od.A();
		od.A(1);
		od.A("coding everybody");

	}

}
