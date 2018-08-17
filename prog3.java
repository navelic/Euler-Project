public class prog3 {

	public static void main(String[] args) {
		 int i;
		 long num=600851475143l;

	        for (i=2;i<=num;i++) 
	        {
	            if (num%i==0)
	            {
	                num=num/i;
	                i--;
	            }
	        }
	        System.out.println(i);
	}}
