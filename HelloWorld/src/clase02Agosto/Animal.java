package clase02Agosto;

public class Animal { // public final class Animal {}-상속이 안됌
	int eye_count;
	int feet_count;

	Animal() {
		this.eye_count=2;
		this.feet_count=4;
	}
	Animal(int x,int y) {
		this.eye_count=x;
		this.feet_count=y;
	}
	void run() {
		System.out.println("달린다.");
	}
	void sound() { //final void sound()- 상속은 가능한데 다른 클래스에서 재정의 불가 
		System.out.println("소리낸다");
	}
}