package day14;

import java.util.Scanner;

/*
����ó�� : ���α׷����� �������� ��Ȳ�� ó���ϴ� ��.
		- ���α׷��� �����Ű�� �ʴ´�.
�������� : throw
�������� : throws
����ó�� : try, catch
*/
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("�� �Է�");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x/y; //������ �߻��� �� �ִ� �ڵ�
//		} catch (ArithmeticException e) { //�ش翹�ܸ� ����ó�� //0���Է� ���� �߻�
			//System.out.println("0�� �Է��ϸ� �ȵ˴ϴ�.");
//			e.printStackTrace(); //����ó�� �αױ��
//		} catch(InputMismatchException e) {//�����Է� ���� �߻�
//			System.err.print("���ڸ� �Է��ϸ� �ȵ˴ϴ�."); //���� �����۾��� ���
		} catch (Exception e) { //���� ó��
			e.printStackTrace();
		}
		System.out.println(result);
		
	}
}
