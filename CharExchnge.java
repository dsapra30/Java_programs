import java.util.Scanner;

class character 
{
	String s;
	Scanner sc=new Scanner(System.in);
	
	void getString()
	{
		System.out.println("Enter the string");
		s=sc.next();
		
	}
	String exchnge()
	{
		char []ch=new char[(s.length())];
		char a=s.charAt(0);
		char b=s.charAt(s.length()-1);
		
		ch[0]=b;
		ch[(s.length()-1)]=a;
		for(int i=1;i<s.length()-1;i++)
		{
			ch[i]=s.charAt(i);
		}
		String str=new String(ch);
		return str;
	}
	
}
public class CharExchnge {

	public static void main(String[] args) {
		character t=new character();
		t.getString();
		String l=t.exchnge();
		System.out.println(l);
	}

}
