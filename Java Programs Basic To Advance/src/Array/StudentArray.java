
public class StudentArray 
{
	String name,qualification;
	int yop;
	double percentage;
	public StudentArray(String name, String qualification, int yop, double percentage) {
		this.name = name;
		this.qualification = qualification;
		this.yop = yop;
		this.percentage = percentage;
	}
	public String Name()
	{
		return name;
	}
	public String Qualification()
	{
		return qualification;
	}
	public int YearOfPass()
	{
		return yop;
	}
	public double Percent()
	{
		return percentage;
	}
	
	public static void main(String[] args) {
		
		StudentArray s1 = new StudentArray("Rajesh","B.Tech",2021,82.17);
		StudentArray s2 = new StudentArray("Aravindh","BE",2023,76.43);
		StudentArray s3 = new StudentArray("Dinesh","B.Sc Computer",2022,89.37);
		StudentArray s4 = new StudentArray("Rudra","B.Com",2020,90.45);
		StudentArray s5 = new StudentArray("Somu","B.Sc Math",2019,79.83);
		StudentArray s6 = new StudentArray("Raja","Mba",2021,59.95);
		StudentArray s7 = new StudentArray("Chandra","Mca",2023,73.67);
		
		StudentArray x[] = {s1,s2,s3,s4,s5,s6,s7};
		for(int i=0;i<x.length;i++)
		{
			StudentArray stu = x[i];
			if(stu.yop==2022 || stu.yop==2023)
			{
				System.out.println(stu.name+" "+stu.qualification+" "+stu.yop+" "+stu.percentage);
			}
			else if(stu.yop<=2022)
			{
				System.out.println(stu.name+" "+stu.qualification+" "+stu.yop+" "+stu.percentage);
			}
			else if(stu.percentage<60)
			{
				if(stu.yop==2022 || stu.yop==2023)
				{
					System.out.println(stu.name+" "+stu.qualification+" "+stu.yop+" "+stu.percentage);
				}
			}
			else if(stu.percentage>60)
			{

				if(stu.yop==2023)
				{
					System.out.println(stu.name+" "+stu.qualification+" "+stu.yop+" "+stu.percentage);
				}
			}
			else if(stu.percentage>60)
			{
				if(stu.yop<2022)
				{
					System.out.println(stu.name+" "+stu.qualification+" "+stu.yop+" "+stu.percentage);
				}
			}
		}
	}
}
