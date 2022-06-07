package day14;

class D01{
	public void test(){
		//예외 처리
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class D02 extends D01{
	public void test2(){
		test();
	}
}
public class Ex08 {
	public static void main(String[] args){
		D02 d = new D02();
		d.test2();
		
		try {
			System.out.println( 10/2 );
		} catch (Exception e) { //문제 발생시
			System.out.println("catch 실행");
		}finally { //예외가 발생하던지 안하던지 무조건 실행된다. //마지막에 꼭 해야하는 행위들을 넣음.
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행!");
		
	}
}