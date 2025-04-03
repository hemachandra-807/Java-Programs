
public class EmployeeArray 
{
	String name,company;
	double annualSalary;
	public EmployeeArray(String name, String company, double annualSalary) 
	{
		this.name = name;
		this.company = company;
		this.annualSalary = annualSalary;
	}
	public String Name()
	{
		return name;
	}
	public String Company()
	{
		return company;
	}
	public Double AnnualSal()
	{
		return annualSalary;
	}
	public static void main(String[] args) {
		
		
		EmployeeArray e1 = new EmployeeArray("Hemachandra","Virtusa",6.5);
		EmployeeArray e2 = new EmployeeArray("Kutty","TCS",2.8);
		EmployeeArray e3 = new EmployeeArray("Pattu","Wipro",10);
		
		EmployeeArray x[] = {e1,e2,e3};
		for(int i=0;i<x.length;i++)
		{
			EmployeeArray emp1 = x[i];
			if((emp1.AnnualSal()>=2.4 && emp1.AnnualSal()<=7)|| (emp1.AnnualSal()==5) || (emp1.AnnualSal()>=8))
			{
				System.out.println(emp1.Name()+" "+emp1.Company()+" "+emp1.AnnualSal());
			}
		}
		
	}
}
