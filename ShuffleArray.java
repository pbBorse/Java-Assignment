package Assing;


	import java.util.ArrayList;
	
	import java.util.Random;

	public class ShuffleArray {


          public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        
         int[] shuffledArray = Arrays.copyOf(originalArray, originalArray.length);
        
        // Shuffle the copied array
        shuffleArray(shuffledArray);
        
        // Print the shuffled array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
    
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
       }
	  }
