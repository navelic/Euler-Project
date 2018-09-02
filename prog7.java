public class prog7 {
	public static void main(String args[])
	{
		long i=2;
		int c=0,pr=0;
		while(i>0)
		{
			for(long j=2;j<Math.sqrt(i);j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0){
				pr++;}
			if(pr==10001){
				break;}
			c=0;
			i++;
		}
		System.out.println(i);
	}

}
