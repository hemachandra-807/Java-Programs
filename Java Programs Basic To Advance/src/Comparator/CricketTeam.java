package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CricketTeam {

	String name;

	public CricketTeam(String name) {
		this.name = name;
	}

	public String toString() {
		return "[ "+name+" ]";
	}

	public static void main(String[] args) {
		CricketTeam[] ct = { 
				new CricketTeam("Sachin Tendulkar"),
				new CricketTeam("Gautam Gambhir"),
				new CricketTeam("Ricky Pointing"),
				new CricketTeam("Shahid Afridi"),
				new CricketTeam("Ms Dhoni"),
			};

		Arrays.sort(ct, new Cricket());
		for(CricketTeam team : ct)
		{
			System.out.println(team);
		}
	}
}

class Cricket implements Comparator<CricketTeam> {
	@Override
	public int compare(CricketTeam o1, CricketTeam o2) {
		String lastName1 = o1.name.substring(o1.name.lastIndexOf(" ") + 1);
		String lastName2 = o2.name.substring(o2.name.lastIndexOf(" ") + 1);

		return lastName1.compareTo(lastName2);
	}
}