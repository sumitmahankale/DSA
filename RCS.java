package Recursion;

public class RCS {
	static void sum2(int n)
	{
		if(n >= 1)
		{
			System.out.println(n+2);
			sum2(n-1);
			System.out.println(n+3);
			sum2(n-2);
		}
	}
		public static void main(String[] args) {
			sum2(7);
		}

	}
	
