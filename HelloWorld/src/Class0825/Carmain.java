package Class0825;

public class Carmain {

	public static void main(String[] args) {
			Car2 myCar=new Car2();
	
			myCar.setGas(5);
			boolean gasState=myCar.isLeftGas();
			if(gasState) {
				System.out.println("출발합니다.");
				myCar.run();
			} 	
			gasState=myCar.isLeftGas();
			if(gasState) {
			System.out.println("gas를 주입할 필요가 없습니다.");
			} else {
				System.out.println("gas를 주입하세요.");
			}
    }
}