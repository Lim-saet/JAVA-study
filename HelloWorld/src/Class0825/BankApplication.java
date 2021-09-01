package Class0825;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("—————————————————————————————");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("—————————————————————————————");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		String ano= scanner.nextLine();
		System.out.println("계좌주");
		String owner=scanner.nextLine();
		System.out.println("초기입금액");
		int balance = scanner.nextInt();
		System.out.println("계좌가 생성되었습니다.");
		Account account=new Account(ano,owner,balance);
		
	}
	
	//계좌목록보기
	private static void accountList() {
		//for문으로 빈배열의 자리를 찾아 계좌정보를 넣음 
		for(int i=0;i<accountArray.length;i++){
			if(accountArray[i]==null) {
				String ch_balance = Integer.toString(balance);
				accountArray = new String[i] {ano,owner,ch_balance};
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		
	}
	
	//출금하기
	private static void withdraw() {
		
	}	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return null;
	
	}
}