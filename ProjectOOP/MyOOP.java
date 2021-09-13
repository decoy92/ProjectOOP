
public class MyOOP {
	public static void main(String[] args) {
		delimiter = "----";
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";
		printA();
		printA();
		printB();
		printB();
	}
	
	public static String delimiter = "";
	public static void printA() {		// 메소드 내용
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {		// 메소드 내용
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	// ...
}