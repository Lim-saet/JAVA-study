package clase28deJulio;

public class Test04 {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int j=i;j<10;j++) {
				outValue(i,j);
			}
		}

	}

	private static void outValue(int x, int y) {//int i, int j==파라미터
		System.out.println(x+"x"+y+"="+(x*y));
		
	}

}
