
public class divisibleby7 {

	public static void main(String[] args) {
	  
	        int num,sum=0;
	        
	        for(num=100;num<=200;num++)
	        {
	        if(num%7==0)
	        {
	            sum+=num;
	        	
	        }
	        
	        }

	        System.out.println("Sum of the numbers divisible by 7 :"+sum);
	}

}
