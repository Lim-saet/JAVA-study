package clase26deJulio;

public class Test02 {

	public static void main(String[] args) {
		//for문안에 for문을 넣어서 구구단을 2단부터 9단까지 출력
		for(int x=2;x<10; x++) {
			for(int i=1;i<10; i++) {
			System.out.println(x+"x"+i+"="+(x*i));
			}
	}

	}

}
