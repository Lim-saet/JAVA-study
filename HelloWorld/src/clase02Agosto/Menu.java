package clase02Agosto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu { //선언과 정의만 들어있고 실행코드는 메소드안에 들어가야함
	 private ArrayList<String> alName;
	 private ArrayList<Integer> alPrice;
	
	 Menu() {
			alName=new ArrayList<String>();
			alPrice=new ArrayList<Integer>();
			
//			addName("Americano");
//			addName("Espresso");
//			addName("Latte");
//			addPrice(2000);
//			addPrice(2500);
//			addPrice(3000);
//			
//			showMenu();
		}

	//생성자 - 주로 초기화 작업용. 이름이 클래스와 같아야 함. 반환값이 없다. 실행->new 연산자가 실행된 직후 자동실행
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}//이거 알아놔야함
	void showMenu() {
		//alName, alPrice 출력
		for(int i=0;i<this.alName.size();i++) {
		 System.out.println("메뉴는 "+this.alName.get(i)+"이고"+"\t"+"가격은 "+this.alPrice.get(i)+"원 입니다.");
		}
	}
		void save() { // arrayList alName,alPrice를 화일(menu.txt)에 저장
			
		}
		void load() { // 화일(menu.txt)를 읽어서 arraylist alName,alPrice에 로그인
			File file=new File("d:/menu.txt");
			if(file.exists()) {
				BufferedReader inFile = null;
				try {
					inFile = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String line;
				try {
					line = inFile.readLine();
					while(line!=null) {
						String[] parts=line.split(",");
						addName(parts[0]);
						addPrice(parts[1]);
						line=inFile.readLine();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); 
				}
			}
	}

	
}
