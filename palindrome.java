package prog1;

public class palindrome {

	public static void main(String[] args) {
		int num=12321;
		int temp,sum=0;
		int rem;
		temp=num;
		while(num>0)
		{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}

}
