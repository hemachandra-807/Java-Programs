
public class MobileArray 
{
	String brand,model,color;
	int price;
	public MobileArray(String brand, String model, String color, int price) 
	{
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public static void main(String[] args) {
		
		
		MobileArray m1 = new MobileArray("Redmi","K50i","Black",27000);
		MobileArray m2 = new MobileArray("Apple","14 Pro","Gold",145000);
		MobileArray m3 = new MobileArray("Samsung","S23","Golden White",88000);
		
		MobileArray[] x = {m1,m2,m3};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i].brand+" "+x[i].model+" "+x[i].color+" "+x[i].price);
		}
	}
}
