package j09_클래스3;

public class Student extends Person {

	private String schoolName; 
	private int schoolCode; 
	private int schoolYear; 
	
	public Student() {}



	public Student(String name, int age, String schoolName, int schoolCode, int schoolYear) {
		super(name, age);
		this.schoolName = schoolName;
		this.schoolCode = schoolCode;
		this.schoolYear = schoolYear;
	}



	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}



	@Override
	public String toString() {
		return super.toString() +  ", Student [schoolName=" + schoolName + ", schoolCode=" + schoolCode + ", schoolYear=" + schoolYear + "]";
	}



	@Override
	public String mealTime() {
		return "점심시간";
	}
	
	
	
	
	
	
	
}
