public class prog10 {
	public static boolean check(int n) {
	    if (n==2)
	        return true;
	    if (n%2==0)
	        return false;
	    for (int i=3;i*i<=n;i=i+2)
	        if (n%i==0)
	            return false;
	    return true;
	}

	public static void main(String[] args) {
		 long s=0;
		 for (int i=2;i<2000000;i++) {
			    if(check(i))
		        {
		            s=s+i;
		        }
		    }
		    System.out.println(s);
	}
}
