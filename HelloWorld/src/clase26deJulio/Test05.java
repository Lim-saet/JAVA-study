package clase26deJulio;

public class Test05 {

	public static void main(String[] args) {
		//소수: 1과 자기자신으로 밖에는 나눠지지않는 수
		//n이라는 숫자가 있으면 2부터 n-1까지 숫자로 n을 나눈다
		//2부터 n-1까지 숫자로 n을 나눈다
		//ex)51이 소수인가? no/ 2,%3==0 17
		//1 2...N-1 N
		//2부터 10000까지의 사이에 있는 모든 소수를 구하는 프로그램 
		//10000이하의 소수 구하기 
		for (int n=2; n<=10000; n++) {
				if(n%2!=0) {
				System.out.println(n);
			}
		}

	}

}
