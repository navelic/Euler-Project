public class fibo
{
	public static void main(String args[])
	{
		int a=1,b=2,c=0,d=2;
		while(c<=4000000)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
			{
				d=d+c;
			}
		}
		System.out.println(d);
		}
	}
