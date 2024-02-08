package practice;

public class assignment3 {
	
	int rollNumber ;
	String name;
	
	
	void calculatingMark() {
		rollNumber = 101;
		name = "siva";
		int marks[] = {56,67,78,45};
		int sum=0;
		System.out.println("student rollno:"+"name: "+name);
		int len = marks.length;

		for(int i=0;i<len;i++) {
			System.out.println("marks"+ marks[i]);
		 sum = sum+ marks[i];
		}
		System.out.println("avg of marks: "+sum/len);
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		assignment3 student = new assignment3();
		student.calculatingMark();
		
		

	}

}
