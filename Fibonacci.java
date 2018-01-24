
public class Fibonacci 
{	    
    public int fibonacci(int n) 
    {
    	int fib[] = { 0, 0, 1 };
    	if(n<=2)
    	{
    		return fib[n];
    	}else
    	{
		    for(int i = 2; i < n; i++)
		    {
		        fib[1] = fib[0] + fib[2];
		        fib[0] = fib[2];
		        fib[2] = fib[1];
		    }
		    return fib[1];
		}
    }
    public static void main(String[] args)
    {
    	Fibonacci f = new Fibonacci();
    	System.out.println(f.fibonacci(3));
    }
}
