package j09_클래스3;

public abstract class Person {
	
	private String name;       //멤버변수
	private int age;
	
	public Person() {
		
	}
	
	
	
	public Person(String name, int age) {		//생성자의 특징 클래스랑 이름이 동일하고 반환자료가 없다. 매개변수가 다른걸 오버로드
		super();
		this.name = name;
		this.age = age;
	}
	
	public void test() {
		String name = "김준일";        //우선순위는 매개변수 = 지역변수가 높음
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String mealTime();



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
	
	
	
	
}
