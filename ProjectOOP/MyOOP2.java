class Print{
	public static String delimiter = "";
	public static void A() {		// 메소드 내용
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {		// 메소드 내용
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
public class MyOOP2 {
	public static void main(String[] args) {
		Print.delimiter = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
	}
}