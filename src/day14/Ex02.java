package day14;

class Calc { //부모 클래스
	public void display() {
		System.out.println("나는 계산기야");
	}
}
class Computer extends Calc{ //extends(상속): 부모가 가지고있는 기능을 자식이 마음대로 사용할 수 있다. //자식클래스
	public void print() {
		System.out.println("나는 컴퓨터야~");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Computer calc = new Computer();//객체 생성
		calc.print(); //Computer 클래스를 먼저 찾아감
		calc.display(); //Computer 클래스를 먼저 찾아가고 메소드 기능을 확인. 메소드 기능이 없으면 상속받은 부모를 찾아가서 메소드 실행
		
	}
}
