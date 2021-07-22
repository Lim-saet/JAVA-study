import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//문자열을 콘솔에서 읽어드린다
		String str=s.nextLine();
		//그 문자열이 자기이름과 같으면
		if (str.equals("a")||str.equals("A")) {
			System.out.println("Apple");
		} else if (str.equals("b")||str.equals("B")) {
			System.out.println("Banana");
		} else if (str.equals("w")||str.equals("W")) {
			System.out.println("Watremelon");
		} else if (str.equals("s")||str.equals("S")) {
			System.out.println("Strawberry");
		} else {
			System.out.println("모르는 이니셜");
		}
		System.out.println("프로그램 종료");

	}

}
