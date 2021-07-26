package clase26deJulio;

public class Test04 {

	public static void main(String[] args) {
		//피보나치수열 : 새숫자는 직전 숫자+ 그전숫자
		// 0 1 2 3 5 8 13 21 33...
		// a=0 b=1 c=a+b 일때 10,000이하의 피보나치 수열을 구하는 프로그램 
		int a=0;
		int b=1;
		int c=1;
		for(a=0;a<10000;a++) {
			if(c<10000) {
				System.out.println(c);
				a=b;
				b=c;
				c=a+b;
			}
			
		}
	}
     
}
