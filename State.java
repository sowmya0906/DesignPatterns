package list;
	interface MobileState  
	{ 
	    public void alert(AlertState ctx); 
	} 
	  
	class AlertState  
	{ 
	    private MobileState currentState; 
	  
	    public AlertState()  
	    { 
	        currentState = new Vibration(); 
	    } 
	  
	    public void setState(MobileState state)  
	    { 
	        currentState = state; 
	    } 
	  
	    public void alert()  
	    { 
	        currentState.alert(this); 
	    } 
	} 
	  
	class Vibration implements MobileState  
	{ 
	    @Override
	    public void alert(AlertState ctx)  
	    { 
	         System.out.println("vibration..."); 
	    } 
	  
	} 
	  
	class Silent implements MobileState 
	{ 
	    @Override
	    public void alert(AlertState ctx)  
	    { 
	        System.out.println("silent..."); 
	    } 
	  
	} 
	  
	class StatePattern  
	{ 
	    public static void main(String[] args)  
	    { 
	        AlertState state = new AlertState(); 
	        state.alert(); 
	        state.alert(); 
	        state.setState(new Silent()); 
	        state.alert();         
	    } 
	} 
