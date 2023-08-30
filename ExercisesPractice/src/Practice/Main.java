package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	static class Student implements Comparable<Student> {

		public String name;
		public int age;
		public double grade;
		

		public Student(String name, int age, double grade) {
			this.name = name;
			this.age = age;
			this.grade=grade;
		}

		@Override
		public String toString() {
			return "Student{" + "name='" + name + '\'' + ", age=" + age +   ", grade=" + grade+ '}' ;
		}

		@Override
		public int compareTo(Student student) {
			return this.age - student.age;
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student("student-1", 34,70.1);
		Student s2 = new Student("student-2", 10,60.5);
		Student s3 = new Student("student-3", 36,80.9);
		List<Student> studentList = Arrays.asList(s2, s1, s3);
		System.out.println("Before sorting");
		System.out.println(studentList);
		
		System.out.println();

		Collections.sort(studentList);
		System.out.println("After sorting");
		System.out.println(studentList);
	}

}
