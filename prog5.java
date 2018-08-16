public class prog5 {

	public static void main(String[] args) {
		double prod=1.0;
		int k;
		for(int i=1;i<=20;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					if(prod%j==0)
					{
						prod=prod/j;
					}
				}
			
			}
			prod=prod*i;
		}
		System.out.println(prod);
	}

}
