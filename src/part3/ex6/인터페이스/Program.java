package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		
		Scanner scan = new Scanner(fis);
		
		String className = scan.nextLine();
		scan.close();
		fis.close();
 
		/* 인스턴스를 생성하는 방법
		 * A a = new A();
		 * A.class.newInstance();
		 */
		
		Class clazz = Class.forName(className);
		
		A a = new A();
		//B b = new B();
		X x = (X) clazz.newInstance();
		
		a.setX(x);
		
		a.print();
		
	}

}
