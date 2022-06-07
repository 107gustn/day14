package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		long t = System.currentTimeMillis(); //�ý��ۿ� ���� ���� �ð� ��� //�ʴ����� ����ð��� ����
		System.out.println(t);
		
		SimpleDateFormat fo = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� -----"); //���� �������� ����
		String s = fo.format(t);
		System.out.println(s);
		
		Date date = new Date();//���� �ð��� �˷���
		System.out.println( date );
		
		String r = fo.format(date);
		System.out.println( r );
		
		for(int i=0; i<10; i++) {
			
			//���� ó��
			try {
				Thread.sleep(1000); //(1/1000 ������ ���)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println( i );
		}
	}

}
