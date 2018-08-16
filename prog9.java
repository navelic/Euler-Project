public class prog9 {

	public static void main(String[] args)
	{
		int a,b=0;
				for (a=1;a<=1000;a++)	
				{
					for (b=1;b<=1000;b++)	
					{
						if (Math.pow(1000-a-b, 2)==(a*a+b*b))
						{
							System.out.println(a*b*(1000-a-b));
						}
					}
				}	
			}
		}
	
