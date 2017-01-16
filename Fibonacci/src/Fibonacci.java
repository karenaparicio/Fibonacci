public class Fibonacci
{
	
	public static long calculate(long i)
	{	
		if (i < 2)
			return i;

		long a = 0;
		long b = 1;
		long fib = 1;

		for (long x = 2; x <= i; x++)
		{
			fib = a + b;
			a = b;
			b = fib;
		}
		System.out.println("Hello");
		return fib;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("No worries.");

	}
}
