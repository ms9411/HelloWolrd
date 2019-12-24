package classes;

public class StudenExample {
	public static void main(String[] args) {
//		String str = "Hello";
//		String str1 = new String("Hello");
		
		Student student = new Student();//new 로 생성자 부름
		student.studentNo = "191234-1234";
		student.studentName = "김철수";
		student.age = 20;
		student.major = "English";
		student.university = "university";
		student.introduce();
		
		Student student1 = new Student("YeDam", "921111-1111", "박철수");
		student1.introduce();
//		System.out.println(student.major);
//		student.doHomework();
//		System.out.println(student);
	}

}