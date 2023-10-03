import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        while (true)
        {
            System.out.print("welcome to the scientific calculator:");
            System.out.println("1. sqaureroot");
            System.out.println("2. cuberoot");
            System.out.println("3. sine");
            System.out.println("4. cose");
            System.out.println("5. power");
            System.out.println("6. ");

            System.out.print("enter the choice :");
            int a=scan.nextInt();
            switch (a)
            {
                case 1:
                System.out.println("enter the number");
                double b=scan.nextDouble();
                System.out.println("the squareroot of the number is :"+ Math.sqrt(b));
                break;

                case 2:
                System.out.println("enter the number");
                double c=scan.nextDouble();
                System.out.println("the cuberoot of the number is :"+ Math.cbrt(c));
                break;
                
            default:
            System.out.println("the input is invaild");

            }



        }

    }
}