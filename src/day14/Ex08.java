package day14;

class D01{
	public void test(){
		//���� ó��
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
		} catch (Exception e) { //���� �߻���
			System.out.println("catch ����");
		}finally { //���ܰ� �߻��ϴ��� ���ϴ��� ������ ����ȴ�. //�������� �� �ؾ��ϴ� �������� ����.
			System.out.println("finally ����");
		}
		System.out.println("���� ����� ����!");
		
	}
}