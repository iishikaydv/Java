import java.util.*;

public class Functions {
	
    // Function for f(x) = 3*(x*x) + 2;
	public static int func(int x) {
		int y = 3*x*x + 2;
		return y;
	}
	

	// Function for f(x) = x*x + y*y;
	public static int fn(int x, int y) {
		int z = x*x + y*y;
		return z;
	}
	

	// return your name
	public static void name() {
		System.out.println("Ishika Yadav");
	}
	
	
	// Function for Factorial
	public static int fact(int x) {
		int fac = 1;
		for(int i=1;i<=x;i++) {
			fac = fac*i;
		}
		return fac;
	}


	// Function for Sum
	public static int sum(int x, int y) {
		int c = x + y;
		return c;
	}


	// Function for Substraction
	public static int sub(int x, int y) {
		int c = y - x;
		return c;
	}


	// Function For Power
	public static int power(int base, int exponent) {
		int power = 1;
		for(int i=1;i<=exponent;i++) {    // Exponent Times run hoga 
			power = power * base;      // 1*base; power*base; and so on base will not change
		}
		return power;
	}


	// Calculate frequency of digit d in number n
	public static int getDigitFrequency(int n, int d) {
		int count = 0;
		while(n!=0) {     // We want loop to work until n is not equal to zero
			int rem = n % 10;
			if(d==rem) {
				count++;
			}
			n = n/10;    // We want one digit less than n
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//
		/*System.out.println(func(3));   // Return of Function for f(x) = 3*(x*x) + 2;
		System.out.println(fn(3, 4));    // Return of Function for f(x) = x*x + y*y;
		name();*/      // return your name

		
		
		// nCr calculation
		// 1st Method  ->  Without Function
		/*int n = 5;
		int r = 3;
		
		int nf = 1;    // n factorial
		for(int i=1;i<=n;i++) {
			nf = nf*i;   // nf *= 1;
		}
		
		int rf = 1;    // r factorial
		for(int i=1;i<=r;i++) {
			rf = rf*i;   // rf *= 1;
		} 
		
		int narf = 1;   // n-r factorial
		for(int i=1;i<=(n-r);i++) {
			narf = narf*i;    // narf *= i;
		}
		
		int ncr = nf / (narf * rf);
		System.out.println(ncr);*/
		
		
		// 2nd Method  ->  With Function
		/*int n = sc.nextInt();
		int nf = fact(n);
		System.out.println("Factorial of n: " + nf);
		int r = sc.nextInt();
		int rf = fact(r);
		System.out.println("Factorial of r: " + rf);
		int narf = fact(n-r);
		System.out.println("Factorial of (n-r): " + narf);
		
		int ncr = nf / (narf*rf);
		System.out.println("Total ncr count is: " + ncr);*/
		


		// Function For Sum
		/*int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
		int add = sum(a, b);
		System.out.println("Addition of numbers are: " + add);*/



		// Function for Sub
		/*int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
		int sb = sub(a, b);
		System.out.println("Substraction of numbers are: " + sb);*/



		// Program For Power
		/*int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
		int ans = power(a, b);
		System.out.println("Power is: " + ans);*/



		// Calculate frequency of digit d in number n
		int n = sc.nextInt();
		int d = sc.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
		

	}
}
