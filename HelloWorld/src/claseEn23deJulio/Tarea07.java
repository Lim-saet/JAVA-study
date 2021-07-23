package claseEn23deJulio;

import java.util.Scanner;

public class Tarea07 {

	public static void main(String[] args) {
		/*// while(조건문) {//조건검사부터
			조건이 참(true)인 동안 실행문들;
					}
			do {
				실행문들;
			}while(조건문); //최후에 조건검사
			do while 뭐라도 한번 실행해야할때 쓰는 구문
		 */
		
//		Scanner s= new Scanner(System.in);
//		String str=s.nextLine();
//		while (!str.equals("x")) {
//				if(str.equals("m")) {
//					System.out.println("메뉴리스트");
//				} else if (str.equals("o")) {
//					System.out.println("주문");
//				} else if (str.equals("s")) {
//					System.out.println("매출현황");
//				} 
//				str=s.nextLine();
//		}
//					System.out.println("프로그램 종료");
		
//		do while문으로 만들어보기	
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		do {
			str=s.nextLine();
		}
		while (!str.equals("x")); {
			if (str.equals("m")) {
				System.out.println("메뉴리스트");
				} else if (str.equals("o")) {
					System.out.println("주문");
				} else if (str.equals("s")) {
					System.out.println("매출현황");
				} 
		
			System.out.println("프로그램 종료");
		}
	}
}
