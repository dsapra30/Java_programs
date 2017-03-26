public class twosum {
    public int reverse(int x) {
     long r=0;
	if(x>=0)
	{
	while(x/10!=0)
		{
			r=(r+x%10)*10;
			x=x/10;
		}		
	}
	else 
	{
		x=-x;
		while(x/10!=0)
		{
			r=(r+x%10)*10;
			x=x/10;
		}		
		r=-r;
		x=-x;
	}
	long z=r+x;
	
	if((z>=0 && z<=2147483647) || (z<0 && z>=-2147483648))
			{
				return (int)z;
			}
	
	
	else 
	{
		return 0;
	}
    }	
}