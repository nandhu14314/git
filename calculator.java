package fifth;

public class calculator {
	int a;
	int b;
	void add()
	{
		a=4;
		b=8;
		System.out.println("adding two numbers=="+(a+b));
				
	}
	void sub()
	{
		a=8;
		b=4;
		System.out.println("subtraction  two numbers=="+(a-b));
				
	}
	void mul()
	{
		a=8;
		b=4;
		System.out.println("multification two numbers=="+(a*b));
				
	}
	void div()
	{
		a=8;
		b=4;
		System.out.println("division  two numbers=="+(a/b));
				
	}

	public static void main(String[] args) {
		calculator v = new calculator();
		v.sub();

	}

}
