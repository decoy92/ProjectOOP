import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		// Math라는 클래스에 PI라는 변수, 그 변수 안에 3.14~ 라는 구체적인 값이 들어있다.
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8)); // 내림 : 1.0. Math의 메소드(floor)
		System.out.println(Math.ceil(1.8)); // 올림 : 2.0.
		// 코드가 많아짐에 따라 서로 연관된 변수와 메소드를 그룹핑 한 껍데기가 클래스이다.
		
		// 어떤 정보를 파일에 기록할 때 사용하는 클래스 : FileWriter
		FileWriter f1 = new FileWriter("data.txt"); // 앞에 new를 붙이면 뒤에 따라오는 클래스는 "data.txt에 파일을 저장하겠다"라는 상태의 복제본이 생성됨.
													// 복제본을 f1 이라는 변수에 담고, 복제본의 데이터 타입은 클래스 이름인 FileWriter.
													// FileWriter 는 import를 해줘야 함.
													// 예외처리 = 첫 번째 (Add throws declaration) *나중에 자세히.
		f1.write("Hello");
		f1.write(" Java");
		f1.close(); // Hello와 Java 라는 텍스트가 기록된 data.txt 라는 파일이 생성됨. (프로젝트 폴더 우클릭 - Refresh)
		
		
		FileWriter f2 = new FileWriter("data2.txt"); 
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		
		
	}

}