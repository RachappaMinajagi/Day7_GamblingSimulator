public class Gambler {
	
	//UC1
	public static final int INITIAL_BET_STAKE = 100;
    public static final int BET_AMT = 1;
    
    //UC2
    public void gambler_SolutionUC2(){
  
    	double num =  Math.floor(Math.random() *10) % 2;
        int remg_amt = INITIAL_BET_STAKE;
        if (num==0){
            remg_amt += BET_AMT;
            System.out.println("The Gambler wins the bet and he has $"
            +remg_amt+ " with him after one bet.");
        }else {
            remg_amt -= BET_AMT;
            System.out.println("The Gambler loses the bet and he has $"
            +remg_amt+ " with him after one bet.");
        } 
    }
    
	public static void main(String[] args) {
		System.out.println("welcome to gambler simulator problem");
		Gambler game = new Gambler();
	}

}
