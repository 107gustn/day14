package day14;

class DBconnect{
	private static DBconnect db; //static: Ŭ���� �̸����� �ܺ� ���� ����
	private static int cnt=0; //private: �ܺ��� ������ ����, ���ο��� ���� ����
	private DBconnect() { cnt++; } //��ü ������ ������ 1�� ����
	public int getCnt() { return cnt; }
	public void controllDB() {
		System.out.println("db���");
	}
	public static DBconnect getInstance() { //Instance: ��ü
		if(db == null)//��ü�� ����������� ������ ��ü ����. �����ϸ� ������ ���� ��ü�� ���� ����Ѵ�.
			db = new DBconnect();//�޼ҵ尡 ȣ���� �ɶ� ���������� ���� ��ü�� ����
		return db;
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		//�̱��� ����: ���� ��ü�� ���� ����ϴ� ���� �ƴ� �ϳ��� ��ü�� ���� ���
		/*
		DBconnect db01 = new DBconnect(); //��ü ����
		DBconnect db02 = new DBconnect();
		DBconnect db03 = new DBconnect();
		DBconnect db04 = new DBconnect();
		DBconnect db05 = new DBconnect();
		DBconnect db06 = new DBconnect();
		*/
		DBconnect db01 = DBconnect.getInstance();
		DBconnect db02 = DBconnect.getInstance();
		DBconnect db03 = DBconnect.getInstance();
		DBconnect db04 = DBconnect.getInstance();
		
		System.out.println(db01);
		System.out.println(db02);
		System.out.println(db03);
		System.out.println(db04);
		
		//db01.controllDB();
		System.out.println(db01.getCnt() + "�� ���� �Ǿ����ϴ�.");

	}

}
