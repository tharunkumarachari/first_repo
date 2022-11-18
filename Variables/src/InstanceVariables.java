/*the variables which are declared inside the class and outside the method/body are known as Instance variables.
   These variables can access any where in the class.To access instance variables we need to create an object*/
public class InstanceVariables 
{
	int a=20;
	String str="tharun";
	public static void main(String args[])
	{
		InstanceVariables  obj=new InstanceVariables();
		System.out.println(obj.a);
		System.out.println(obj.str);
//		System.out.println(a);
	}
}
