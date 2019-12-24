package classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.birthday = "1900-00-00";
		p1.age = 10;
		
		
		Person p2 = new Person();
		p2.name = "길동홍";
		p2.birthday = "1900-00-00";
		p2.age = 20;
		
		
		Person p3 = new Person();
		p3.name = "동홍길";
		p3.birthday = "1900-00-00";
		p3.age = 30;
 
		Person [] psary = new Person[3];
		psary [0] = p1;
		psary [1] = p2;
		psary [2] = p3;
		
		p1.introduce();
		p2.introduce();
		p3.introduce();
		
	// 확장 for
//	for (int i = 0; i < 3; i++) {
//		personary[i].introduce();
//	}
//	System.out.println("==============");
//	for(Person p : personary) {
//		p.introduce();
//	}
	}
}
