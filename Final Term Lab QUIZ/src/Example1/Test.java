package Example1;

public class Test {

	public static void main(String[] args) 
	
	{
		BANK H =new HSBC (" HSBC  Bank ", 3.00);
		H.show();
		System.out.println(" HSBC Bank Interest Rate  = " + H.InterestRate() + " Percent");
		
		System.out.println();
		
		BANK B = new BRAC (" BRAC Bank ",5.00);
		B.show();
		System.out.println(" BRAC Bank Interest Rate  = " + B.InterestRate() + " Percent");
		
		

	}

}
