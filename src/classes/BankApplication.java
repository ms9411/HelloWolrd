package classes;

import java.util.Scanner;

public class BankApplication {
	public static Account[] accountArray = new Account[100];
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("=========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("=========================================");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt();
			scn.nextLine();
			
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			} else if (selectNo == 2) {
				// 계좌목록
				accountList();
			} else if (selectNo == 3) {
				//예금
				deposit();
			} else if (selectNo == 4) {
				//출금
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	public static void createAccount() {
		//작성 위치
		System.out.println("계좌번호 입력");
		String ano = scn.nextLine();
		System.out.print("사용자 입력: ");
		String owner = scn.nextLine();
		System.out.print("금액입력: ");
		int balance = scn.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = acnt;
				break;
			}
		}
		
	}
	
	//계좌목록보기
	public static void accountList() {
		//작성위치
		for(Account acnt : accountArray) {
			if(acnt != null) {
				System.out.println(acnt);
			}
		}
	}
	
	//예금하기
	static void deposit() {
		//작성위치
		System.out.print("조회할 계좌 입력 :");
		String ano = scn.nextLine();
		System.out.print("입금할 금액 입력:");
		int amount = scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalanace(balance + amount);
		
	}
	
	//출금하기
	static void withdraw() {
		//작성위치
		System.out.print("조회할 계좌 입력 :");
		String ano = scn.nextLine();
		System.out.print("출금할 금액 입력:");
		int amount = scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalanace(balance + amount);
	}
	
	//Account
	static Account findAccount(String ano) {
		//작성위치
		Account accnt = null;
		for(Account acnt : accountArray){
			if(acnt != null) {
				if(ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}
		return accnt;
	}
}
