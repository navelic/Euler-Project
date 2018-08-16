public class prog10 {

	public static void main(String[] args) {
		int c=0,s=0;
		for(int i=1;i<=2000000;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
			{
				s=s+i;
			}
			c=0;
		}
		System.out.println(s);
	}

}
