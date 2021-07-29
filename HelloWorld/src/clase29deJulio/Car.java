package clase29deJulio;

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
		private ArrayList<Integer> dailyRun;
		
		
		void drive(int x) {
			this.nSpeed=x;
		}
		void stop() {
			this.nSpeed=0;
		}
		public String getnColor() {
			return nColor;
		}
		public void setnColor(String nColor) {
			this.nColor = nColor;//this.nColor:위에서 정의한 속성(변수)을 의미
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
		public ArrayList<Integer> getDailyRun() {
			return dailyRun;
		}
		public void setDailyRun(ArrayList<Integer> dailyRun) {
			this.dailyRun = dailyRun;
		}
		
   		
}
