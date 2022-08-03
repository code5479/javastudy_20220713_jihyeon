package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {

		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");

		HashSet<Student> set = new HashSet<Student>();

		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);



		Iterator<Student> ir = set.iterator();
		while (ir.hasNext()) {
			Student str = ir.next();
			if (str.getName().equals("서재효")) {
				ir.remove();

			}
		}
		System.out.println(set);

	}

}
