import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BillifyTest {
	
	//Property "Array Size" Test:
	//This test is used to validate that the size of the output array
	//will be one plus the size of the input array at all times
	@Test
	public void testPropertySize() {
			
		for(int i = 0; i < 100; i++){
			int inputArray[] = RandomArrayGenerator.generateRandomArrays();
			
			int outputArray[] = Map.billify(inputArray);
			
			//assert the length of the output and the input array differs by 1
			assertEquals(outputArray.length, inputArray.length + 1);
		}
	}
	
	//Property "Output Values Doubled" Test:
	//This test is used to validate that each element of the output array
	//will be the double of the corresponding elements in the input array
	@Test
	public void testPropertyOutputIsDoubled() {
			
		for(int i = 0; i < 100; i++){
			int inputArray[] = RandomArrayGenerator.generateRandomArrays();
			
			int outputArray[] = Map.billify(inputArray);
			
			//assert each element of the output array is double of the corresponding elements in the input array
			for(int j = 0; j < inputArray.length; j++){
				assertEquals(outputArray[j], inputArray[j] * inputArray[j]);
			}
		}
	}
	
	//Property "Purity" Test:
	//This test is used to validate that the function returns the
	//same output array for the same input array always
	@Test
	public void testPropertyPurity() {
			
		for(int i = 0; i < 100; i++){
			int inputArray[] = RandomArrayGenerator.generateRandomArrays();
			
			int outputArray[] = Map.billify(inputArray);
			
			int outputArray2[] = Map.billify(inputArray);
			
			//assert billify called with the same input array twice returns the same output arrays
			assertArrayEquals(outputArray, outputArray2);
			
		}
	}
	
	//Property "Last Element Sum Of All Others" Test:
	//This test is used to validate that the last element of the output array
	//is the sum of all the other elements in it
	@Test
	public void testPropertyLastElementSumOfAllOtherElements() {
			
		for(int i = 0; i < 100; i++){
			
			int inputArray[] = RandomArrayGenerator.generateRandomArrays();
			
			int outputArray[] = Map.billify(inputArray);
			
			int arraySum = 0;
			
			//find sum of all the elements other than the last element of the output array
			for(int j = 0; j < outputArray.length - 1; j++){
				
				arraySum += outputArray[j];
			}	
			
			//assert the last element of the output array is equal to the sum of all the other elements
			assertEquals(outputArray[outputArray.length - 1], arraySum);
		}
	}
	
	//Property "Last Element is the Greatest" Test:
	//This test is used to validate that the last element of the output array
	//will be the greatest element in the array
	@Test
	public void testPropertyLastElementIsGreatest() {
			
		for(int i = 0; i < 100; i++){
			int inputArray[] = RandomArrayGenerator.generateRandomArrays();
			
			int outputArray[] = Map.billify(inputArray);
			
			//assert each element in the output array is less than or equal(for a single element array) to the last element
			for(int j = 0; j < outputArray.length - 1; j++){
				assertTrue(outputArray[j] <= outputArray[outputArray.length - 1]);
			}		
			
		}
	}

}
