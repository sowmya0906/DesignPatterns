package list;
	interface Employee 
	{ 
	    public void EmployeeDetails(); 
	} 
	 class Developer implements Employee 
	{ 
	    private String name; 
	    private long empId; 
	    private String position; 
	    public Developer(long empId, String name,String position) 
	    { 
	        this.empId = empId; 
	        this.name = name;   
	        this.position=position;
	    }   
	    @Override
	    public void EmployeeDetails()  
	    { 
	        System.out.println(empId+" " +name+"works as "+position); 
	    } 
	} 
	
 class Manager implements Employee 
	{ 
	    private String name; 
	    private long empId; 
	    private String position; 
	    
	    public Manager(long empId, String name,String position) 
	    { 
	        this.empId = empId; 
	        this.name = name; 
	                this.position=position;
	    } 
	      
	    @Override
	    public void EmployeeDetails()  
	    { 
	        System.out.println(empId+" " +name+"works as "+position); 
	    } 
	} 
	
	public class Composite
	{ 
	    public static void main (String[] args) 
	    { 
	       
	          
	        Manager man1 = new Manager(200, "Kushagra Garg","Manager"); 
	        Manager man2 = new Manager(201, "Vikram Sharma ","Assistant Manager"); 
	          man1.EmployeeDetails();
	          man2.EmployeeDetails();
	          
		       Developer d1 = new Developer(300, "Rajesh","Developer"); 
		        Developer d2 = new Developer(301, "Kumar","Developer"); 
		        d1.EmployeeDetails();
		        d2.EmployeeDetails();
	    } 
	} 


