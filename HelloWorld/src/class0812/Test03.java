package class0812;

public class Test03 {

	public static void main(String[] args) {
		//while, Math.random()
		//두개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2)형태로 출력
		//눈의 합이 5가 아니면 계속 진행
		//눈의 합이 5이면 실행 멈춤 
		//눈의 합이 5-->1,4 4,1 2,3 3,2

		while(true) {
			int i=(int)(Math.random()*6)+1;
			int j=(int)(Math.random()*6)+1;
			System.out.println("눈"+i+"눈"+j);
			//5가 아니면 빠져나가서 반복문 종료
			if(i+j==5) 
			{
				System.out.println("눈"+i+"눈"+j);
				System.out.println("주사위 실행을 멈춥니다.");
				break;
			}
		}
		
	}

}
