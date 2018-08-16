public class prog7 {
	public static void main(String args[])
	{
		int i=1;
		int c=0,pr=0;
		while(true)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==1){
				pr++;}
			if(pr==10001){
				break;}
			c=0;
			i++;
		}
		System.out.println(i);
	}

}
