package Collections;

public class EmpComparator {
public int id;
public String Name;
public int age;

public EmpComparator(int id, String name, int age) {
	super();
	this.id = id;
	Name = name;
	this.age = age;
}

public int getId() {
	return id;
}

public String getName() {
	return Name;
}

public int getAge() {
	return age;
}

@Override
public String toString() {
	return "EmpComparator [id=" + id + ", Name=" + Name + ", age=" + age + "]";
}


}
