import java.util.*;	
class Unit1
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number:");
		int flag=0;

		int num=scan.nextInt();
		for(int i=2;i<=num;i++)
		{
		 	if(num%i==0)
			{
			System.out.println("its not a prime");

			flag=1;
			break;
		
                        }
		}
		 if(flag==0)

		{
			System.out.println("its not a prime");
		}
		
	} 

}