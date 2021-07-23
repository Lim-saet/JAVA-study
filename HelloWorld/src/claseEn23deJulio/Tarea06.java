package claseEn23deJulio;

import java.util.Scanner;

public class Tarea06 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		while (true) {
			String str=s.nextLine();
			if(str.equals("x")) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (str.equals("m")) {
				System.out.println("메뉴");
			}
			else if (str.equals("o")) {
				System.out.println("주문");
			}
			else if (str.equals("s")) {
				System.out.println("매출");
			}
			
		}

	}

}
