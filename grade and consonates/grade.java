import java.util.*;
class Gradingsystem
{
 	public static void main(String[] arg)
{ 	Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		double m=scan.nextInt();
		if(m>=80)
		{
			System.out.println("The obtained grade is O");
		}
		else if(m<80 && m>= 60)
		{
			System.out.println("The obtained grade is A");
		}
		else if(m<40 && m>=35)
		{
			System.out.println("the obtained Grade is B");
		}
		else if (m<35 && m>=20)
		{
		System.out.println("the grade obtained is c");
		}
		else 
		{ 
			System.out.println("Sorry you have failed");
		}

}

}