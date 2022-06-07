package day14;

class C01{
	protected String n;//private: 상속을 받더라도 사용X //protected: 같은 패키지내, 상속받은 자식에서는 접근 가능
}
class C02 extends C01 {
	public void test() {
		n = "안녕하세요"; //자기자신에게 해당 변수가 없으면 부모의 변수를 가져다 쓴다
		print();
	}
	public void print() { System.out.println(n); }
}

public class Ex04 {
	public static void main(String[] args) {
		//키워드 - protected: 외부의 접근을 막는다.
		C02 c = new C02(); //객체 생성
		c.test(); //기능 호출
	}
}
