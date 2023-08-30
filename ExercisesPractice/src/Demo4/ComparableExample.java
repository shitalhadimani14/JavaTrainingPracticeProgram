package Demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		Student student1 = new Student("Amol Kapur", 23, 90.22);
		Student student2 = new Student("Ashwini Khan", 21, 92.43);
		Student student3 = new Student("Sagar Patel ", 25, 84.7);
		Student student4 = new Student("Sonali Sharma", 20, 87.50);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		Collections.sort(students);

		System.err.println("Students sorted by age in Descending Order : ");

		for (Student stu : students) {
			System.out.println(stu.getName() + "  " + stu.getAge() + "  " + stu.getGrade());
		}

		NameCompare nameCompare = new NameCompare();

		Collections.sort(students, nameCompare);

		System.err.println("Students sorted by Name : ");

		for (Student stu : students) {
			System.out.println(stu.getName() + "  " + stu.getAge() + "  " + stu.getGrade());
		}

		GradeCompare gradeCompare = new GradeCompare();

		Collections.sort(students, gradeCompare);

		System.err.println("Students sorted by Grade : ");

		for (Student stu : students) {
			System.out.println(stu.getName() + "  " + stu.getAge() + "  " + stu.getGrade());
		}

	}

}
