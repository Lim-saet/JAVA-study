package claseEn23deJulio;

public class Tarea04 {

	public static void main(String[] args) {
		int n=1;
		while (n<101) {
			if(n%2==1) {
			System.out.println(n);
			} 
			n++;
			}
		// %: n%x==0 : n은 x의 배수  --->1부터 100사이의 5의 배수만 출력하는 while문
				int x=5;
				// 반복문에서 가장 치명적인 실수 = 무한히 반복하는 경우(무한루프)
				// 반복문 = 무한루프 회피 
				while (x<101) {
					if (x%5==0) {
						System.out.println(x);
					}
					x++;
				}
		}
		//1부터 100까지 홀수만 출력하는 while문
	
}


