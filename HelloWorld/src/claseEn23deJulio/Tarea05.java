package claseEn23deJulio;

import java.util.Scanner;

public class Tarea05 {

	public static void main(String[] args) {

		/*
		 *   1. 사용자 입력을 받는다. 
		 *   2. 입력값이 'x'면 "프로그램 종료"를 출력하고 프로그램 종료
		 *   3. 입력값이  (if-else, if/switch)
		 *     a.'m'이면 '메뉴리스트'를 출력
		 *     b.'o'면 "주문"을 출력
		 *     c.'s'면 "매출현황" 출력
		 *   4. 1.로 돌아간다. (while?)
		 */
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		while (!str.equals("x")) {
				if(str.equals("m")) {
					System.out.println("메뉴리스트");
				} else if (str.equals("o")) {
					System.out.println("주문");
				} else if (str.equals("s")) {
					System.out.println("매출현황");
				} 
				str=s.nextLine();
		}
					System.out.println("프로그램 종료");
					s.close();
		}
	}
	//dhk rodjfuqek!!!
	
