package clase29deJulio;

import java.util.ArrayList;

public class Menu { //선언과 정의만 들어있고 실행코드는 메소드안에 들어가야함
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName=new ArrayList<String>();
		this.alPrice=new ArrayList<Integer>();
	}
	//생성자 - 주로 초기화 작업용. 이름이 클래스와 같아야 함. 반환값이 없다. 실행->new 연산자가 실행된 직후 자동실행
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		//alName, alPrice 출력
		for(int i=0; i<alName.size();i++) {
		 System.out.println("메뉴는 "+alName.get(i)+"이고"+" "+"가격은 "+alPrice.get(i)+"원 입니다.");
		}
	}

	
}
