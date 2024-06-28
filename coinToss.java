import java.util.Random;
    
class coinToss{
    private int N=3;
    private int countH=0, countT=0;
    private int[] in;

    public coinToss(){
	Random random = new Random();
	in = new int[N];
	for(int i=0 ; i<N ; i++){
	    in[i] = random.nextInt(100000);
	}

	System.out.println("Tossing a coin...");
	
	for(int i=0 ; i<N ; i++){
	    if(in[i]>=50000){
		countH++;
		System.out.println("Round " + (i+1) + ": Headls");
	    }
	    else {
		countT++;
		System.out.println("Round " + (i+1) + ": Tails");
	    }
	}
	System.out.println("Heads: " + countH + ", Tails: " + countT);
    }

    public static void main(String[] args){
	new coinToss();
    }
}
    

    

	

	
