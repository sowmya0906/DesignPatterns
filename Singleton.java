package list;

public class Singleton {
	
	    private static Singleton obj;  
	    private Singleton() {} 
	  String g="hello to all epam students";
	    public static Singleton getInstance() 
	    { 
	        if (obj==null) 
	            obj = new Singleton(); 
	        return obj; 
	    } 
}
	    class Main{
	    	public static void main(String args[]) {
	    		Singleton x = Singleton.getInstance(); 
               x.g=(x.g).toUpperCase();
               System.out.print(x.g);

	    	}
	    }
	
