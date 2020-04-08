package Example1;

public abstract  class BANK 

{
     
	public String Name;
	public double Interest;
	
	public BANK(String name, double interest) 
	
	{
		super();
		Name = name;
		Interest = interest;
		
	}

	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public double getInterest() 
	{
		return Interest;
	}

	public void setInterest(double interest) 
	{
		Interest = interest;
	}
	
	public abstract double InterestRate();
	
	public void show ()
    {
    	System.out.println(" Bank Name : "+ Name);
    	
    }
	
	
	
	
	
}
