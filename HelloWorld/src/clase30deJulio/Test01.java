package clase30deJulio;
import clase30deJulio.Car;//다른 패키지의 자바클래스를 임포트 

public class Test01 {

	public static void main(String[] args) {
		// 변수 사용가능범위(중괄호 내로 제한된다)
		//scope

		Test02 t=new Test02();
		//t.setField(10); 이거 왜 안되는데 ㅅ
		t.setField("Hello");
		System.out.println(t.getT1()+","+t.getT2());
		t.setK(7);
		System.out.println(t.getK());
		Test02 tx=new Test02();
		System.out.println(tx.getK());
		
		Car ce = new Car();
	}
}
