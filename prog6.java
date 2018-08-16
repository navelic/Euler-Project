public class prog6 {

	public static void main(String[] args) {
		int s=0,c=0;
		for(int i=1;i<=100;i++)
		{
			s=s+(i*i);
			c=c+i;
		}
		int d=(c*c)-s;
		System.out.println(d);
	}

}
