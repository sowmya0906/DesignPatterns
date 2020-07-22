package list;
import java.util.*;
	interface Internet 
	{ 
	    public void connectTo(String server); 
	} 
	class TrueInternet implements Internet 
	{ 
	    @Override
	    public void connectTo(String server) 
	    { 
	        System.out.println("Connecting to "+ server); 
	    } 
	} 
	  
class ProxyInternet implements Internet 
	{ 
	    private Internet internet = new TrueInternet(); 
	    private static List<String> proxySites; 
	      
	    static
	    { 
	        proxySites = new ArrayList<String>(); 
	        proxySites.add("abc.com"); 
	        proxySites.add("def.com"); 
	        proxySites.add("ijk.com"); 
	        proxySites.add("lnm.com"); 
	    } 
	      
	    @Override
	    public void connectTo(String server) 
	    { 
	        if(proxySites.contains(server) )
	        { 
	            System.out.println("Access Denied"); 
	        } 
	        else
	        internet.connectTo(server); 
	    } 
	  
	}  
	  
	public class Proxy
	{ 
	    public static void main (String[] args) 
	    { 
	        Internet internet = new ProxyInternet(); 
	            internet.connectTo("geeksforgeeks.org"); 
	            internet.connectTo("abc.com"); 
	          
	} 
}
