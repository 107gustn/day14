package day14;

class A02 {
	public A02(String n) {
		System.out.println(n + " : A02 실행");
	}//실행 후 다시 자기 자신에게 돌아감
	public void t() { System.out.println("부모"); }
}
class A01 extends A02{ //상속을 받고있으면 부모 생성자가 먼저 실행된다.
	public void t() { System.out.println("자식"); }
	public A01() { //생성자: 해당 객체가 생성될때 자동으로 호출 //값이 없을때 실행
		super("값값");//부모 생성자에 값이 필요한 경우 값을 전달해줌
		System.out.println("A01 생성자 실행");
		//super(부모 메소드 호출):부모에 대한 정보를 알고있음. //this(자신의 메소드 호출): 자기 자신에 대한 정보를 알고있음. 
		//일반 메소드 호출은 자기 자신이 우선이 되고 없으면 부모를 호출한다.
		super.t();
	}
	public A01(String s) {//값이 있을때 실행
		super(s); //부모 생성자에 값을 넘겨줌
	}
}
//상속: 나에게 가지고 있지 않는 메소드라면 부모를 찾아간다.
public class Ex03 {
	public static void main(String[] args) {
//		A01 a = new A01(); //객체 생성후 생성자 호출 //자기 자신을 만들었으니 자신 먼저 찾아감
		A01 a = new A01("받아주는값"); //해당객체를 만들때 생성자를 찾아가 값을 넣어줌
	}
}
