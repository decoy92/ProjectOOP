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
		System.out.println(Foo.classVar); // 클래스 접근가능
//		System.out.println(Foo.instanceVar); // 인스턴스 접근 불가
		Foo.classMethod(); // OK
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		
		
	}

}