package practice;

public class assignment2 {
	String title;
	String author;
	double price;
	double discount;


	void calculating(String title,String author,double price,double discount) {
		
		double total = price - discount;
		System.out.println("book author "+author+" title: "+ title+" price :"+price +"after discount price"+total);
	}
	
	
		
	
	

	public static void main(String[] args) {
		
		assignment2 book = new  assignment2();
		book.calculating("ramayanam","valimki",345.67,20.00);
		
		book.calculating("bharatam","vinayaku",987.99,87.99);
		
		
		

	}

}
