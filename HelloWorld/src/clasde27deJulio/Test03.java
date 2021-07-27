package clasde27deJulio;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//Factorial : n! 
		//4! = 4*3*2*1
		//양의 정수를 입력한다 단 10 이하의 숫자 
		//팩토리얼을 계산하는 프로그램을 만든다
		System.out.print("팩토리얼 연산할 양의 정수: ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int f=1;//팩토리얼 결과값 변수??
		
		for(int a=1; a<=n; a++) {
				f=a*f;
	
		}
		System.out.println(f);
		s.close();
		
	}

}
