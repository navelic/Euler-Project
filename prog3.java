public class prog3 {

	public static void main(String[] args) {
		 int i;
		 long num=600851475143l;
			 while(num%2==0)
				 num=num/2;
		        for (i=3;i<=Math.sqrt(num);i+=2) 
		        {
		            if (num%i==0)
		            {
		                num=num/i;
		            }
		        }
		        if(num>2)
		        System.out.println(num);
		}}

