package day14;

class Calc { //�θ� Ŭ����
	public void display() {
		System.out.println("���� �����");
	}
}
class Computer extends Calc{ //extends(���): �θ� �������ִ� ����� �ڽ��� ������� ����� �� �ִ�. //�ڽ�Ŭ����
	public void print() {
		System.out.println("���� ��ǻ�;�~");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Computer calc = new Computer();//��ü ����
		calc.print(); //Computer Ŭ������ ���� ã�ư�
		calc.display(); //Computer Ŭ������ ���� ã�ư��� �޼ҵ� ����� Ȯ��. �޼ҵ� ����� ������ ��ӹ��� �θ� ã�ư��� �޼ҵ� ����
		
	}
}
