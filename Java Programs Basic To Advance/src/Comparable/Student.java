package Comparable;

public class Student implements Comparable<Object> {
	
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
//	public int compareTo(Object o) {
//		Student s = (Student)o;
//		if(age>s.age)return 1;
//		if(age<s.age)return -1;
//		return 0;
//	}
	
	public int compareTo(Object o)
	{
		Student s =((Student)o);
		return this.name.compareTo(s.name);
	}
}
