class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(intanceVar); // Error	
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // Ŭ���� ���ٰ���
//		System.out.println(Foo.instanceVar); // �ν��Ͻ� ���� �Ұ�
		Foo.classMethod(); // OK
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		
		
	}

}