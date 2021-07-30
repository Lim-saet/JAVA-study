package clase30deJulio;

import java.util.ArrayList;

public class Car { 
	//private 정보보호 
//	외부에서 private으로 보호하고 있는 필드값을 고칠때 set:수정-setter 
//	외부에서 private으로 보호하고 있는 필드값을 조회할때get:조회
		private String nColor;
		private int maxSpeed;
		private int nSpeed;
		private int guest;
		private String modelName;
		private int nWheel;
		private String nName;
		
		
		//생성자 오버로딩(constructor overloading)<-다형성
		Car() {//face : Car라는 생성자는 얼굴이 두개입니다..
			   //기본생성자(default constructor) - 매개변수 없음
				//body
//			this.nColor="blue";
//			this.guest=5;
//			this.maxSpeed=240;
//			this.nSpeed=0;
			this("blue",5,240,0);//파라미터 4개짜리 호출 생성자를 통해 다른 생성자를 호출할 수 있다
		}
		Car(String c,int g, int m, int n) {//파라미터 4개 
			this.nColor=c;
			this.guest=g;
			this.maxSpeed=m;
			this.nSpeed=n;
		}
		
		Car(String a,int b, int c, int d, String e, int f) {
//			this.nColor=a;
//			this.guest=b;
//			this.maxSpeed=c;
//			this.nSpeed=d;
			this(a,b,c,d);//다른 생성자 속 동작 호출==위의 c g m n의  값을 호출, this 클래스의 다른 생성자를 의미 합니다
			this.nName=e;
			this.nWheel=f;
		}
		public Car(String nColor, int maxSpeed, int nSpeed, int guest, String modelName, int nWheel, String nName) {
			this.nColor = nColor;
			this.maxSpeed = maxSpeed;
			this.nSpeed = nSpeed;
			this.guest = guest;
			this.modelName = modelName;
			this.nWheel = nWheel;
			this.nName = nName;
		}
		public String getnColor() {
			return nColor;
		}
		public void setnColor(String nColor) {
			this.nColor = nColor;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public int getnSpeed() {
			return nSpeed;
		}
		public void setnSpeed(int nSpeed) {
			this.nSpeed = nSpeed;
		}
		public int getGuest() {
			return guest;
		}
		public void setGuest(int guest) {
			this.guest = guest;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public int getnWheel() {
			return nWheel;
		}
		public void setnWheel(int nWheel) {
			this.nWheel = nWheel;
		}
		public String getnName() {
			return nName;
		}
		public void setnName(String nName) {
			this.nName = nName;
		}
		void drive(int x) { 
			this.nSpeed=x;
		}
		void stop() {
			this.nSpeed=0;
		}
		
		
   		
}
