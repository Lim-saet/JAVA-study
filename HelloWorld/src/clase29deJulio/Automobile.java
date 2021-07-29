package clase29deJulio;

public class Automobile {

	public static void main(String[] args) {
		Car seltos= new Car();
//		seltos.nColor="white";
		
		seltos.setnColor("blue");
		System.out.println("색상:"+seltos.getnColor());
		seltos.setGuest(3);
		System.out.println("승객수:"+seltos.getGuest());
		seltos.drive(50);
		System.out.println("현재속도:"+seltos.getnSpeed());
		seltos.stop();
		System.out.println("정지 후 속도:"+seltos.getnSpeed());
	}
}
