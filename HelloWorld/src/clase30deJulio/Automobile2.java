package clase30deJulio;

public class Automobile2 {

	public static void main(String[] args) {
		Car car= new Car();

		
//		System.out.println(car.nColor);
//		System.out.println(car.guest);
//		System.out.println(car.maxSpeed);
//		System.out.println(car.nSpeed);
//		
//		System.out.println("");
//		
//		Car avante=new Car("grey",5,280,30);
//		System.out.println(avante.nColor);
//		System.out.println(avante.guest);
//		System.out.println(avante.maxSpeed);
//		System.out.println(avante.nSpeed);
		
		Car grandeur=new Car("black",5,320,50,"Grandeur",4);
		System.out.println(grandeur.getnColor());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getnName());
		System.out.println(grandeur.getnWheel());
	}
}
