package clase02Agosto;

public class Human extends Animal {//상위 클래스를 Animal로 지정-Human은 animal을 상속한다.
	//Human이 자식클래스 Aniaml이 복수클래스
	Human() { //생성자 오버라이딩: 부모생성자가 호출되지 않고 자식의 생성자가 먼저 호출 되는 것 
//		super(2,2);//부모의 생성자 호출=애니멀의 일반생성자(int x,int y) 호출
		super();
		this.feet_count=4;
	}
	void run() {
		System.out.println("걷는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부한다.");
	}
}
