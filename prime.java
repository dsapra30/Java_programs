package prog1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int count=0;
		for(int i=2;i<=num;i++)
		{
		if(num%i==0)
		{
			count++;
		}
		else
		{
			count=0;
		}
		}
		if(count>0)
		{
			System.out.println("Non prime number");
		}
		else
		{
			System.out.println("Prime number");
		}

}
}
