package clase28deJulio;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ArrayList+Scanner 학생들 수학점수를 읽어들이는 프로그램
		//-1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다
		//읽어들이기가 끝나면 
		//1 모든학생의 점수를 출력
		//2 점수의 총합계,평균점수를 계산해서 출력
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> score=new ArrayList<Integer>();
		 while(n!=-1) {  
			 score.add(n);
			 
			 n=s.nextInt();
		 }   
		for (int i=0;i<score.size();i++) {
			System.out.println(score.get(i));
		} 
		int a=0;
		for(int x=0;x<score.size();x++) {
				a=a+score.get(x);
				
		}
		System.out.println("합계:"+a);
		System.out.println("평균:"+(a/score.size()));
		s.close();
	}
	
  }

