package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithoutUsingNestedLoops {

	public static String twoSum(int[] array, int target)
	{
		Map<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < array.length; i++) {
            int compliment = target - array[i];

            if (map.containsKey(compliment)) {
                return map.get(compliment) + " " + i; // or if the asked to return arr means, return new int[] {map.get(compliment), i);
            }

            map.put(array[i], i); 
        }
        return "No pair found"; // if no pair found return new int[]{};
	}
	public static void main(String[] args) {
		
		int[] array = {1, 2, 4, 7, 3, 8 };
		int target = 3;
		
		System.out.println(twoSum(array, target));
 	}
}
