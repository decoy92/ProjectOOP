
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
	public static void printA() {		// �޼ҵ� ����
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {		// �޼ҵ� ����
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	// ...
}