package Example2;


public class Student {

	
	
	public String name;
	public int id;
	public double cgpa;
	
	public Student(String name, int id, double cgpa) 
	
	{
		super();
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		
	}
	
	public void show1 ()
	{
		System.out.println(" Student 1 Name  : "+name);
		System.out.println(" Student 1 Id : "+id);
		System.out.println(" Student 1 CGPA : "+cgpa);
		
		WriteFile.WriteStudent1(name, id, cgpa);
		
		
	}
	
	public void show2 ()
	{
		System.out.println(" Student 2 Name  : "+name);
		System.out.println(" Student 2 Id : "+id);
		System.out.println(" Student 2 CGPA : "+cgpa);
		
		WriteFile.WriteStudent2(name, id, cgpa); 
		
	}
	
	
}
