import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		// Math��� Ŭ������ PI��� ����, �� ���� �ȿ� 3.14~ ��� ��ü���� ���� ����ִ�.
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8)); // ���� : 1.0. Math�� �޼ҵ�(floor)
		System.out.println(Math.ceil(1.8)); // �ø� : 2.0.
		// �ڵ尡 �������� ���� ���� ������ ������ �޼ҵ带 �׷��� �� �����Ⱑ Ŭ�����̴�.
		
		// � ������ ���Ͽ� ����� �� ����ϴ� Ŭ���� : FileWriter
		FileWriter f1 = new FileWriter("data.txt"); // �տ� new�� ���̸� �ڿ� ������� Ŭ������ "data.txt�� ������ �����ϰڴ�"��� ������ �������� ������.
													// �������� f1 �̶�� ������ ���, �������� ������ Ÿ���� Ŭ���� �̸��� FileWriter.
													// FileWriter �� import�� ����� ��.
													// ����ó�� = ù ��° (Add throws declaration) *���߿� �ڼ���.
		f1.write("Hello");
		f1.write(" Java");
		f1.close(); // Hello�� Java ��� �ؽ�Ʈ�� ��ϵ� data.txt ��� ������ ������. (������Ʈ ���� ��Ŭ�� - Refresh)
		
		
		FileWriter f2 = new FileWriter("data2.txt"); 
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		
		
	}

}