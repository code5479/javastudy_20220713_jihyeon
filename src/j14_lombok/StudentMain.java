package j14_lombok;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student = new Student();				//lombok을 이용한 기본생성자 사용가능
		
		Student student2 = new Student(20220001, "김준일", 2, 29);		//lombok을 이용한 전체생성자 사용가능
		
		System.out.println(student2);
		
		
		
	}
	
}
