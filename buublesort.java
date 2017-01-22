package prog1;

public class buublesort {
	public static void main(String args[])
	{
		int [] a={10,4,7,2,9};
		
		int temp=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(a[k]);
		}
	}

}
