package Class0825;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1= new Korean("박자바","1234-1234");
		Korean k2= new Korean("홍길동","4321-4321");
		
		System.out.println("k1의 이름:"+k1.name+","+"주민번호:"+k1.ssn);
		System.out.println("k2의 이름:"+k2.name+","+"주민번호:"+k2.ssn);
	}

}
