package Java_programs;

public class FibonacciExample {
	public static void main(String[] args) {
	int a=0, b=1,c,i,count=10;
		System.out.print(" "+a);
		System.out.print(" "+b);
		
		for(i=2;i<count;++i)
		{
		c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	

}

// If We print horizontal lines then we use only print
// If We print fibonacci lines in straight line then we use println for print line
