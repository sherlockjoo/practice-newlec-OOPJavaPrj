package part3.ex6.인터페이스;

public class A {

	private X x; // X 인터페이스 생성
	
	public void setX(X x) {
		this.x = x; // B 인스턴스
	}

	public A() {
		//b = new B();
	}
	
	public void print() {
		int total = x.total(); // X 인터페이스 구조체
		System.out.printf("total is %d\n", total);
	}
	
}
