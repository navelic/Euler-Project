public class multiples {

	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%3==0 || i%5==0)
				s=s+i;
		}
		System.out.println(s);
	}
}
