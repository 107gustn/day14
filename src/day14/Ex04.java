package day14;

class C01{
	protected String n;//private: ����� �޴��� ���X //protected: ���� ��Ű����, ��ӹ��� �ڽĿ����� ���� ����
}
class C02 extends C01 {
	public void test() {
		n = "�ȳ��ϼ���"; //�ڱ��ڽſ��� �ش� ������ ������ �θ��� ������ ������ ����
		print();
	}
	public void print() { System.out.println(n); }
}

public class Ex04 {
	public static void main(String[] args) {
		//Ű���� - protected: �ܺ��� ������ ���´�.
		C02 c = new C02(); //��ü ����
		c.test(); //��� ȣ��
	}
}
