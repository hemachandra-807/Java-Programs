package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBasedOnSecondDigit {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(50);
		a.add(32);
		a.add(17);
		a.add(45);
		Collections.sort(a, new Sort());
		System.out.println(a);
	}
}

class Sort implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1%10 - o2%10;
	}	
}
