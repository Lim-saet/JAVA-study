package clase02Agosto;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Menu menu=new Menu();
		menu.load();
		
		// m: 메뉴관리
		// o: 주문관리
		// s: 실적보기
		// x: 프로그램 종료
		
		Scanner s = new Scanner(System.in);
		String t=s.nextLine();
		
		while(!t.equals("x")) {
		if(t.equals("m")) {
			System.out.println("메뉴관리");
		} else if (t.equals("o")) {
			System.out.println("주문관리");
		} else if (t.equals("s")) {
			System.out.println("실적보기");
		} 
			t=s.nextLine();
		}
		System.out.println("프로그램 종료");
		s.close();
		
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력:");
//		String name=s1.nextLine();
//		while(!name.equals("")) {
//			System.out.println("가격입력:");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력:");
//			name=s1.nextLine();
//		}
//		System.out.println("메뉴목록");
		menu.showMenu(); 
//		s1.close(); s2.close();
	}
}


