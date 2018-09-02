public class palindrome {

	public static void main(String[] args) {
		int s=0,palin=0;
		for(int i=1;i<=999;i++)
		{
			for(int j=0;j<=999;j++)
			{
			s=0;
			int n=(i*j);
			int m=n;
			while(m>0)
			{
				int r=m%10;
				s=(s*10)+r;
				m=m/10;
			}
			if(n==s && n>palin)
			palin=n;
			}
	}
			System.out.println(palin);
		}}
