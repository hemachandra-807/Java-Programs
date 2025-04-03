import java.util.ArrayList;
import java.util.Comparator;

public  class Test4 implements Comparator<Integer>
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(56);
		al.add(89);
		al.add(67);
		al.add(34);
		System.out.println(al);
	}
	public int compare(Integer i, Integer j) {
		if(i%10 > j%10)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
