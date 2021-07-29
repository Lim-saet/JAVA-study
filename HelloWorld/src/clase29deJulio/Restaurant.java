package clase29deJulio;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Menu menu = new Menu();//함수 선언: Menu클래스가 변수 menu의 값에 들어감 
		menu.init();
		//메뉴이름/가격을 입력하는 루틴
		//메뉴이름이 ""이 입력되면 루틴(반복문) 종료
		//그동안 입력된 메뉴명/가격출력
		
	
		Scanner s= new Scanner(System.in);
		
		
//		while(true) {//while문이 트루이기때문에 계속 반복 false가 나올때까지 무한 반복
//			System.out.println("메뉴 입력");
//			String m=s.nextLine();//입력을 기다리고 있음
//			if(m.equals("")) {
//				System.out.println("종료");
//				break;
//			}//공백을 치면 바로 종료되길 원하기 때문에 nextLine 다음에 바로 브레이크문
//			System.out.println("가격 입력");
//			int pr=s.nextInt();//가격입력을 기다리고 있음
//			s.nextLine();//다른메뉴입력을 위해 엔터를 치면 빈문자열로 인식되지 않게 하기위하여 
//						 //가짜nextLine 추가
//			
//			menu.addName(m);//menu-함수/addName(m)-동작 /
//							//Menu클래스에 어떤동작을 실행할것인지 명시해놨기 때문에 
//							//함수를 선언해서 호출 
//							//어레이리스트에 메뉴 입력
//			menu.addPrice(pr);//addPrice(pr)- 어레이리스트에 가격 입력
//		}
		
		
		int p=s.nextInt();
		String m=s.nextLine();
		
		while(!m.equals("")) { //메뉴 가격 입력 반복문 
			System.out.println("메뉴입력");
			String mn=s.nextLine();
			menu.addName(mn);
			System.out.println("가격입력");
			menu.addPrice(p);
			
		}
		
		menu.showMenu();//Menu클래스의 showMenu 함수부분 행동 가져와주세요.
		s.close();
	}

}
