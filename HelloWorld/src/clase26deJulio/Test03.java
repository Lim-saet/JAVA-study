package clase26deJulio;

public class Test03 {

	public static void main(String[] args) {
		//break 멈춤 빠져나옴
				//continue 계속  가장 안쪽의 반복문의 조건문으로 이동 
				//for문에서 컨티뉴를 만나면 후실행 후 조건문으로 이동
				/*
				 * for(int i=0;i<100;i++) { if(i<50) { System.out.println(i+" continue");
				 * continue; } System.out.println(i); }
				 */
				//sneak문 만들기 for if while 
		int n=4;
		int s=0;
		for(int i=0;i<n; i++) {
			if(i%2==0) { //짝수줄
				for(int j=0;j<n;j++) {
					s++;
					System.out.print(s+"\t");//\t
				}
				System.out.println("");//공백을포함시킬때도 쌍따옴표 필요
				s=s+n;
			} else { //홀수줄
				for(int j=0;j<n;j++) {
					System.out.print(s+"\t");
					s--;
				}
				s=s+n;
				System.out.println("");
			}
		   
		}//약간 복잡한 로직,,
	}
}
	
			 

	


