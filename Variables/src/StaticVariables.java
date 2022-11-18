/*the variables which are declared which are declared with 'static' keyword inside the class but outside the
method are known as Static Variables
Static variables are created when the program starts and destroyed when the program stops
Static variables are used in the static memory*/
public class StaticVariables {
	static int a=10,b=20;
	public static void main(String args[])
	{
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println("the value of a+b is:"+(a+b));
	}

}
