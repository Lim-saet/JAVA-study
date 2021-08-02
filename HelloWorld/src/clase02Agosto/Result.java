package clase02Agosto;

public class Result {

	public static void main(String[] args) {
		Animal animal=new Animal(2,2);//int x,y 실행
		
		System.out.println("눈"+animal.eye_count);
		System.out.println("발"+animal.feet_count);
		animal.run();
		animal.sound();
		
		Human saram= new Human(); 
		
		System.out.println("인간 눈:"+saram.eye_count); //Aniaml 클래스의 값을 상속 받아 쓸 수 있음 
		System.out.println("인간 발:"+saram.feet_count);
		saram.run(); //메소드 오버라이딩
		saram.sound(); //메소드 오버라이딩
		saram.study();
	}

}
