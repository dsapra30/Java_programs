import java.util.Scanner;

interface shape
{
	void getdata();
	void putdata(double area);
}
abstract class Figure 
{
	double x,y;
	abstract double area(String s);
}
public class Demo extends Figure implements shape {
	Scanner s=new Scanner(System.in);
	public void getdata()
	{
		
		System.out.println("Enter x:");
		x=s.nextDouble();
		System.out.println("Enter y:");
		y=s.nextDouble();
	}
	public void putdata(double area)
	{
		System.out.println(area);
	}
	public double area(String s)
	{
		double area;
		if(s.equalsIgnoreCase("Square") && x==y)
		{
			area=x*y;
			return area;
		}
		else if(s.equalsIgnoreCase("Rectangle"))
		{
			area=x*y;
			return area;
		}
		else if(s.equalsIgnoreCase("Triangle"))
		{
			area=(0.5)*x*y;
		return area;
		}
		return 0;
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.getdata();
		
		double a=d.area("Square");
		double b=d.area("Rectangle");
		double c=d.area("Triangle");
		System.out.println("Area of square:");
		d.putdata(a);
		System.out.println("Area of rectangle:");
		d.putdata(b);
		System.out.println("Area of triangle:");
		d.putdata(c);
	}

}
