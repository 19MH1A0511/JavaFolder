package practice;

public class assingment5 {
	
	double demension1;
	double demension2;
	double permeter;
	double area;
	
	void circle(double demension1) {
		double pi = 3.14;
		permeter = 2*demension1*pi;
		area = pi * demension1*demension1;
		System.out.println("area of circle:"+area+" permeter  of circle:"+permeter);
	}
	void rectangle(double demension1,double demension2) {
		area = demension1*demension2;
		permeter = 2*(demension1*demension2);
		System.out.println("area of rectangle:"+area+" permeter  of rectangle:"+permeter);
		
	}
	void triangle(double demension1,double demension2,double demension3) {
		area = 0.5*demension1*demension2;
		permeter =  demension1+demension2+demension3;
		System.out.println("area of triangle:"+area+" permeter  of triangle:"+permeter);

	}

	public static void main(String[] args) {
		
		assingment5 shape = new assingment5();
		shape.circle(3);
		shape.rectangle(4, 5);
		shape.triangle(3, 4, 5);
		
 
	}

}
