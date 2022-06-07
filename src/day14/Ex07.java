package day14;

import java.util.Scanner;

/*
예외처리 : 프로그렘에서 예외적인 상황을 처리하는 것.
		- 프로그램을 종료시키지 않는다.
강제예외 : throw
예외전가 : throws
예외처리 : try, catch
*/
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("수 입력");
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x/y; //문제가 발생할 수 있는 코드
//		} catch (ArithmeticException e) { //해당예외명 예외처리 //0값입력 문제 발생
			//System.out.println("0을 입력하면 안됩니다.");
//			e.printStackTrace(); //예외처리 로그기록
//		} catch(InputMismatchException e) {//문자입력 문제 발생
//			System.err.print("문자를 입력하면 안됩니다."); //에러 붉은글씨로 출력
		} catch (Exception e) { //예외 처리
			e.printStackTrace();
		}
		System.out.println(result);
		
	}
}
