package test;

import java.util.Scanner;

public class SwimmingExample{
	private String memberId;
	private String name;
	private int phone;
	
	public static Swimming[] swimmingArray = new swimming[100];
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		while(run) { 
			System.out.println("1.회원추가 | 2.회원수정 | 3.회원삭제 | 4.리스트 |5.종료");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt();
			scn.nextLine();
			
			if(selectNo == 1) {
				memberAccount();
			} else if (selectNo == 2) {
				memberedit();
			} else if (selectNo == 3) {
				memberDelete();
			} else if (selectNo == 4) {
				memberlist();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	public static void memberAccount() {
		System.out.println("회원ID: ");
		String mamberId = scn.nextLine();
		System.out.println("회원이름: ");
		String name = scn.nextLine();
		System.out.println("회원번호: ");
		int phone = scn.nextInt();
		Swimming acnt = new swimming(mamberId, name, phone);
		for(int i=0;i<swimmingArray.length;i++) {
			if(swimmingArray[i]==null) {
				swimmingArray[i] = acnt;
				break;
			}
		}
		
	}
	
	//수정
	public static void memberedit() {
		System.out.println("회원ID: ");
		String mamberId = scn.nextLine();
		System.out.println("회원이름: ");
		String name = scn.nextLine();
		System.out.println("회원번호: ");
		int phone = scn.nextInt();
		Account accnt = findAccount(mamberID);
		int balance = accnt.getBalance();
		accnt.setBalanace(balance + amount);
		
	}
	
	//삭제
	static void memberDelete() {
		System.out.print("조회할 계좌 입력 :");
		String ano = scn.nextLine();
		System.out.print("출금할 금액 입력:");
		int amount = scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalanace(balance + amount);
	}
	//리스트
	public static void memberlist() {
		for(Account acnt : accountArray) {
			if(acnt != null) {
				System.out.println(acnt);
			}
		}
	}
	//종료
	static Account findAccount(String ano) {
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
