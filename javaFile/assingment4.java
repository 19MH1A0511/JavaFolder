package practice;

public class assingment4 {
	
	long accountNumber ;
	String accountName;
	double balance;
	long mobileNumber;
	
	
	void accountDetails() {
		accountName = "siva";
		accountNumber = 456345768342l;
		mobileNumber = 8864345604l;
		balance = 5467.89;
		System.out.println("accountName:"+accountName+"\naccountNumber:"+accountNumber+"\nmobileNumber:"+mobileNumber+"\nbalance:"+balance);
		
	}
	void deposit(double depositamount) {
		  balance= balance + depositamount;
		System.out.println("totalbalance"+balance);		
	}
	void withdrawal(double depositwithdrawal) {
		 if (depositwithdrawal < balance  ) {
		 balance =balance - depositwithdrawal;
		System.out.println("totalbalance"+balance);
		
			 System.out.println("withdrawal is sucessfully");
		 }else {
			 System.out.println("your balance is low"); 
		 }
		
	}
	
	
	

	public static void main(String[] args) {
		
		assingment4 preson = new assingment4();
		preson.accountDetails();
		preson.deposit(10000);
		preson.withdrawal(34000);
		

	}

}
  