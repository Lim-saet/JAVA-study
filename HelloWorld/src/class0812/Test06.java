package class0812;

public class Test06 {

	public static void main(String[] args) {
		//1234
		//8765
		//9101112 데이터 넣기
		//콘솔창에 array 위 모양대로 출력하기
		int[][] array=new int[3][4];
		int num=1;
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				for(int j=0;j<array[j].length;j++) {
					array[i][j]=num++;
				}
				} else {
					for(int j=array[i].length-1;j>=0;j--) {
						array[i][j]=num++;
						System.out.print(array[i][j]);
					}
					
				}
			
		}
	}

}
