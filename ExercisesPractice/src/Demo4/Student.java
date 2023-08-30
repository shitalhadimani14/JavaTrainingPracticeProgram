package Demo4;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double grade;

	public Student() {
		super();
	}

	public Student(String name, int age, double grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
    public int compareTo(Student stu) {

 

        return stu.age - this.age;
    }
}