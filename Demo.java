
public class Demo {
	//a. Compiler error
	static
	{
		print(10);
	}
	static void print(int x)
	{
		System.out.println(x);
		System.exit(0);
	}
}
