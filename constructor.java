package prog1;

class cons
{
	double a,b,c;
	cons()
	{
		a=0.0;
		b=0.0;
		
	}
	cons(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		c=(a+b)/2;
		System.out.println("Average :"+c);
	}
	
}
public class constructor {

	public static void main(String[] args) {
		cons obj1=new cons();
		cons obj2=new cons(7,8);
		obj1.display();
		obj2.display();
	}

}
