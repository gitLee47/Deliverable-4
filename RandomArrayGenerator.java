import java.util.Random;

public class RandomArrayGenerator {
	
	public static int[] generateRandomArrays(){
		
		Random randomGenerator = new Random();
		
		//Setting random size and random range
		int randomRange = randomGenerator.nextInt(100);
		int randomSize = randomGenerator.nextInt(100);
		
		//Incrementing range and size by 1 if 0
		if(randomRange == 0)
			randomRange++;
		
		if(randomSize == 0)
			randomSize++;
		
		int[] randomInts = new int[randomSize];
		
		//Generating the random array
	    for (int idx = 0; idx < randomSize; idx++){
	    	
	    	int randValue = randomGenerator.nextInt(randomRange);
	    	
	    	//Increment by one if random value generated above is 0
	    	if(randValue == 0){
	    		randValue++;
	    	}
	    	
	    	randomInts[idx] = randValue;
	    }
	    
		return randomInts;
	}
}
