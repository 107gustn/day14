package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06 {
		private Date date;
		private SimpleDateFormat simpl;
		
		public Ex06() { //생성자
			simpl = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //형식 변경
		}
		
		public void print() {
			String result = null;
			for(int i=0; i<10; i++) {
				date = new Date(); //현재 시간을 얻어옴
				try {
					Thread.sleep(1000); //1초 단위
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				result = simpl.format(date);
				System.out.println(result);
			}
		}
		
}
