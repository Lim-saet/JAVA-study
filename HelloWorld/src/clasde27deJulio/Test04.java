package clasde27deJulio;

import java.util.ArrayList;

public class Test04 {

	public static void main(String[] args) {
		// 배열
		/*
		 * String[] ar = new String[2]; 
		 * ar[0]="ss"; 
		 * ar[1]="sss"; 
		 * ar[2]="ssss";
		 * ar[3]="sssss"; 
		 * ar[4]="s"; 
		 * System.out.println(ar[3]);//콘솔오류
		 * 
		 * int[] pnt = new int[5]; 
		 * int[] pnt = {1,2,3,4,5}; //배열 선언을 하면서 초기값을 입력 할 수 있음
		 */	
//		String[] studentName= new String[5];
//		studentName[0]="jane";
//		studentName[1]="jenny";
//		studentName[2]="jacob";
//		studentName[3]="jenifer";
//		studentName[4]="jerry";
//		for (int i=0;i<studentName.length; i++) {
//			System.out.println(studentName[i]);
//		}
		
		//ArrayList 배열의 특성을 가지되 배열길이 수정가능
		//CRUD(Create/Read/Update/Delete)
		ArrayList<String> studentName2=new ArrayList<String>();
		studentName2.add("John");
		studentName2.add("Jessica");
		studentName2.add("Jucy");
		studentName2.add("Jason");
//		System.out.println(studentName2.get(0));
//		System.out.println(studentName2.get(1));
//		System.out.println(studentName2.get(2));
		for(int i=0; i<studentName2.size(); i++) {
			System.out.println(studentName2.get(i)); //조회
		}
		System.out.println("\n\n\n");
		studentName2.set(2, "Jefferson");//수정(replace)
		for(int i=0;i<studentName2.size();i++) {
			System.out.println(studentName2.get(i));//조회
		}
		System.out.println("\n\n\n");
		studentName2.remove(3); //by index
//		studentName2.remove("Jason");// by value
		//데이터를 지우면서 길이도 삭제함 
		for(int i=0;i<studentName2.size();i++) {
			System.out.println(studentName2.get(i));//조회
		}
//		studentName2.clear();// delete all
		// method(메쏘드) - get remove set add p.724
		ArrayList<Integer> point=new ArrayList<Integer>();
		point.add(100);
		point.add(84);
		
	} 

}
