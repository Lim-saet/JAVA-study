package clasde27deJulio;

public class Findsosu {

	public static void main(String[] args) {
		// 10,000이하의 소수 구하기
		// 2,3,5,7,11.. 1과 자기자신외에 나눠지는 수가 없음
		
		for (int i=2;i<=10000;i++) {
			int n;
			for(n=2;n<i;n++) {
				if(i%n==0) {
					break;
				} 
			}
			if(i==n) {
				System.out.println(i);
			}
		}
		
	}

}
