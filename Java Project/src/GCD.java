import java.util.Scanner;

public class GCD {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter First Number:");
			int a=sc.nextInt();
			System.out.println("Enter Second Number:");
			int b=sc.nextInt();
			int gcd=1;
	        for(int i = 1; i <= a && i <= b; ++i)
	        {
	           
	            if(a % i==0 && b % i==0)
	                gcd = i;
	        }

	        System.out.printf("G.C.D of %d and %d is %d", a, b, gcd);
	    }
	}

