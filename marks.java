import java.util.Scanner;

public class marks {

	public static void main(String[] args) 
	{
		//int []subj=new int[5];
		int sum=0;
		int []mrks=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject"+(i+1));
			mrks[i]=s.nextInt();
			sum+=mrks[i];
		}
		float avg=(float)sum/5;
		System.out.println("Marks Scored:"+avg);
		if(avg>=90)
		{
			System.out.println("A grade");
		}
		else if(avg>=80 && avg<=89)
		{
			System.out.println("B grade");
		}
		else if(avg>=70 && avg<=79)
		{
			System.out.println("C grade");
		}
		else if(avg>=60 && avg<=69)
		{
			System.out.println("D grade");
		}
		s.close();
	}

}
