package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		long t = System.currentTimeMillis(); //시스템에 대한 현재 시간 출력 //초단위로 현재시간을 얻어옴
		System.out.println(t);
		
		SimpleDateFormat fo = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 -----"); //지정 형식으로 변경
		String s = fo.format(t);
		System.out.println(s);
		
		Date date = new Date();//현재 시간을 알려줌
		System.out.println( date );
		
		String r = fo.format(date);
		System.out.println( r );
		
		for(int i=0; i<10; i++) {
			
			//예외 처리
			try {
				Thread.sleep(1000); //(1/1000 단위로 대기)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println( i );
		}
	}

}
