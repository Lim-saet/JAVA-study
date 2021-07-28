package clase28deJulio;

public class Test03 {
		public static void main(String[ ]args) {
			for(int i=2;i<10;i++) {
				show(i);//함수호출
				System.out.println("");
			}
		}
		//함수 (메소드) 선언(정의)
		private static void show(int i) {
			// 변수 명명 규칙(1)$, ,알파벳으로만 시작 (2)두번째문자부터는 $, , 알파벳,숫자 사용가능 (3) 자바키워드는 변수로 사용할 수 없음 
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
}
