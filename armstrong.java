package prog1;

public class armstrong {

	public static void main(String[] args) {
		int num=371;
		int temp;
		int rem;
		int sum=0;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}

	}

}
