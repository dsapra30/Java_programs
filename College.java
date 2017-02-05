package prog1;

import java.util.Scanner;


class EligibleCriteria
{
	String name;
	String enroll;
	int total=0,sum=0;
	int num;
	
	EligibleCriteria()
	{
		name="N.A.";
		enroll="N.A.";
	}
	Scanner s=new Scanner(System.in);
	double[] attd=new double[5];
	int [] subjcode=new int[5];
	int [] creditt=new int[5];
	int [] credite=new int[5];
	
	void input() throws Exception 
	{
		System.out.println("Enter the number of subjects:");
		num=s.nextInt();
		
		System.out.println("Enter the name of the Student");
		name=s.next();
		System.out.println("Enter the enrollment no:");
		enroll=s.next();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the subject code");
			subjcode[i]=s.nextInt();
			System.out.println("Enter the attendance in this subject");
			attd[i]=s.nextDouble();
			System.out.println("Enter the credit for the subject");
			creditt[i]=s.nextInt();
			sum+=creditt[i];
			System.out.println("Enter the credit earned");
			credite[i]=s.nextInt();
			total+=credite[i];
			System.out.println("Total credits earned:"+total);
			System.out.println("-----------------------------------------------");
		}
	}
	void creditsystem()
	{
		
		if((0.5*total)<=sum)
		{
			System.out.println("Eligible for exams on the basis of credits");
		}
		else
		{
			System.out.println("Not eligible for exams");
		}
		
	}
	void attendance()
	{
		for(int j=0;j<num;j++)
		{
		if(attd[j]>=75)
		{
			System.out.println(subjcode[j]+" Eligible for exams");
		}
		else
		{
			System.out.println(subjcode[j]+" Debarred");
		}
		}
	}
	void eligible()
	{
		
	}
}
public class College {

	public static void main(String[] args) {
		EligibleCriteria obj=new EligibleCriteria();
		try
		{
		obj.input();
		obj.creditsystem();
		obj.attendance();
		}
		catch(Exception e)
		{
			System.out.println("Caught");
			
		}
		
	}

}
