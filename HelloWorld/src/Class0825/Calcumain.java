package Class0825;

public class Calcumain {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		System.out.println("덧셈연산: "+myCalc.plus(5,6));
		System.out.println("나눗셈연산: "+myCalc.divide(10, 4));
		myCalc.powerOff();
	}

}
