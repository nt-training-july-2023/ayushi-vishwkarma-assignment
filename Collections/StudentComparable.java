package Collections;

public class StudentComparable implements Comparable<StudentComparable> {
private int Roll;
private String Name;
private int age;
private int marks;
public StudentComparable(int roll, String name, int age, int marks) {
	super();
	Roll = roll;
	Name = name;
	this.age = age;
	this.marks = marks;
}
public int getRoll() {
	return Roll;
}

public String getName() {
	return Name;
}

public int getAge() {
	return age;
}

public int getMarks() {
	return marks;
}
public int compareTo(StudentComparable o) {
	return this.Roll-o.Roll;
}
@Override
public String toString() {
	return "StudentComparable [Roll=" + Roll + ", Name=" + Name + ", age=" + age + ", marks=" + marks + "]";
}




}
