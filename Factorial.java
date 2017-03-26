import java.util.Scanner;

class calculation
{
	long getip()
	{
		long num;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to calculated:");
		num=s.nextInt();
		return num;
	}
	long fact(long num)
	{
		
		if(num>0)
		{
		num*=fact(num-1);
		}
		else if(num==0) 
		{
			return 1;
		}
		return num;
	}
}
public class Factorial {

	public static void main(String[] args) {
		
			calculation c=new calculation();
			long z=c.getip();
			long x=c.fact(z);
			System.out.println(x);
	}

}
