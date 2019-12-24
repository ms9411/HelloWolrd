package classes;

public class Person {
	String name;
	String birthday;
	int age;
	
	Person() {
		
	}
	Person(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	void introduce() {
		System.out.println("이름은 " + name + "생일은 " + birthday);
	}
}