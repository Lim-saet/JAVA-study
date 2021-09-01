package clase06deAgosto;

public class Test01 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);//0.5동안 잠들겠다?
			} catch(Exception e) {}
		}
		for(int i=0;i<5; i++) {
			System.out.println("땅");
			try { 
				Thread.sleep(500);
			} catch(Exception e) {}
		}

	}

}
