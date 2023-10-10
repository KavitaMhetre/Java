package cloudVandana;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {

	 public static void main(String[] args) {
	        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        arrayList.add(4);
	        arrayList.add(5);
	        arrayList.add(6);
	        arrayList.add(7);

	        // Shuffle the ArrayList
	        Collections.shuffle(arrayList);

	        // Print the shuffled ArrayList
	        System.out.println("Shuffled Array: " + arrayList);
	 }
}
