
public class Map {
	
	public static int[] billify(int[] x){
		
		if(x == null || x.length == 0)
			throw new IllegalArgumentException("Input array cannot be null or empty.");
		
		int[] foldedArray = new int[x.length + 1];
		int arraySum = 0;
		
		//Generate the folded array
		for(int i = 0; i < x.length; i++){
			
			foldedArray[i] = x[i] * x[i];
			arraySum += foldedArray[i];
		}
		
		//insert the sum of the elements as last element of the folded array
		foldedArray[x.length] = arraySum;
		
		return foldedArray;
	}
	
	//Included for observing program run
	public static void main(String[] args){
		
		int x[] = billify(new int[]{10,10,10});
		
		for(int i=0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}

}
