package practice;

public class preson {
	String name;
	int age;
	String gender;
	
	void displayDetails() {
		name= "rambabu";
		age = 39;
		gender = "male";
		
		System.out.println("name:"+name+"age: "+age+"gender: "+gender);
	}
	void displayDetails1() {
		name= "rambabu";
		age = 39;
		gender = "male";
		
		System.out.println("name:"+name+"age: "+age+"gender: "+gender);
	}
	

	public static void main(String[] args) {
		
		preson p1 = new preson();
		p1.displayDetails();

	}

}
