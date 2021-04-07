
public class MethodOverloading {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(2.5, 3.4));
		System.out.println(obj.add(4, 5));
		System.out.println(obj.add(1, 3, 5));
	}

}
