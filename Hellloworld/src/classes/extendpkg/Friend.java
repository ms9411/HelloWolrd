package classes.extendpkg;
// 시험문제
import java.util.Scanner;

public class Friend {
	public static void main(String[] args) {
		friend();
	}//대학동창 회사동료 시험문제
	private String name;
	private String phone;
	private String col;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public static void friend() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.입력 2.조회 3.리스트 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			scanner.nextLine();
			if(menu==1) {
				System.out.println("입력: ");
				amt = scanner.nextInt();
			}else if(menu==2) {
				System.out.println("출금액>");
				amt = scanner.nextInt();
			}else if(menu==3) {
				System.out.println("잔고>");
			}else if(menu==4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
