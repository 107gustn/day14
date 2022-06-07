package day14;

class DBconnect{
	private static DBconnect db; //static: 클래스 이름으로 외부 접근 가능
	private static int cnt=0; //private: 외부의 접근을 막음, 내부에서 접근 가능
	private DBconnect() { cnt++; } //객체 생성할 때마다 1씩 증가
	public int getCnt() { return cnt; }
	public void controllDB() {
		System.out.println("db사용");
	}
	public static DBconnect getInstance() { //Instance: 객체
		if(db == null)//객체가 만들어진적이 없으면 객체 생성. 존재하면 이전에 만든 객체를 같이 사용한다.
			db = new DBconnect();//메소드가 호출이 될때 내부접근을 통해 객체를 생성
		return db;
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		//싱글톤 패턴: 여러 객체를 만들어서 사용하는 것이 아닌 하나의 객체만 만들어서 사용
		/*
		DBconnect db01 = new DBconnect(); //객체 생성
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
		System.out.println(db01.getCnt() + "명 연결 되었습니다.");

	}

}
