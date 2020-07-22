package list;

	class CricketData 
	{ 
	    int runs, wickets; 
	    float overs; 
	    CurrentScoreDisplay currentScore; 
	    public CricketData(CurrentScoreDisplay currentScore) 
	    { 
	        this.currentScore = currentScore; 
	    } 
	    private int getLatestRuns() 
	    { 
	        return 50; 
	    } 
	    private int getLatestWickets() 
	    { 
	        return 3; 
	    } 
	    private float getLatestOvers() 
	    { 
	        
	        return (float)6.1; 
	    } 
	    public void Changeddata() 
	    { 
	        
	        runs = getLatestRuns(); 
	        wickets = getLatestWickets(); 
	        overs = getLatestOvers(); 
	  
	        currentScore.update(runs,wickets,overs);  
	    } 
	} 
	class CurrentScoreDisplay 
	{ 
	    private int runs, wickets; 
	    private float overs; 
	  
	    public void update(int runs,int wickets,float overs) 
	    { 
	        this.runs = runs; 
	        this.wickets = wickets; 
	        this.overs = overs; 
	        display(); 
	    } 
	  
	    public void display() 
	    { 
	        System.out.println("\nCurrent Score Display: \n" + 
	                           "Runs: " + runs +"\nWickets:"
	                           + wickets + "\nOvers: " + overs ); 
	    } 
	} 
	
	class ObserverPattern
	{ 
	    public static void main(String args[]) 
	    { 
	        CurrentScoreDisplay currentScoreDisplay = 
	                                       new CurrentScoreDisplay();  
	        CricketData cd = new CricketData(currentScoreDisplay); 
	        cd.Changeddata(); 
	    } 
	} 


