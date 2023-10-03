class employee 
{
   protected String ename;
   protected  double bsalary;
   static int count ;
   {
    count++;
   }
//default constructor
public  employee ()
{
    ename="NULL";
    bsalary=0;
}
//overloding constructor
 public employee(String name,double bs)

 {
   ename= name;
   bsalary=bs;
 }
 //copy constructor
public employee(employee e)
{
    this.ename=e.ename;
    this.bsalary=e.bsalary;
}
// get set method
public void setename(String name)
{
    this.ename=name;

}
public String getename()
{
    return ename;
}

public void setbsalary(double salary)
{
    bsalary=salary;
}

public double getbsalary()
{
    return bsalary;
}

//instance method
public void printemployeedetails()
{
    System.out.print("The name of the employee is "+ename+" & the salary is " +bsalary);
}
 public double getbasicincome()
 {
     return bsalary+0.2*bsalary+0.4*bsalary;
 }

 //static method
 public static int countemployees()
 {
    return count;
 }
}
class salesmanager extends employee
{
       double salesamount;

public salesmanager()
{
    super();
    salesamount=0;
}
public salesmanager(String n,double bs,double sa)
{
    super(n,bs);
    salesamount=sa;
}
@Override
public void printemployeedetails() {
    // TODO Auto-generated method stub
    super.printemployeedetails();
    System.out.println("\n And its salesamount is :"+salesamount);
}
public double getnetincome()
{
    return super.getbsalary()+(int)(0.3*salesamount);      // return super.getBasicSalary() + (int) (0.2 * salesAmount);

}
}
class testofemployee
{
    public static void main(String [] args)
    {
            employee e1=new employee("shreya",2000);
            e1.printemployeedetails();
            System.out.println("\nNet income:"+e1.getbasicincome());
            salesmanager s1=new salesmanager("Herit", 200, 300);
            s1.printemployeedetails();
            System.out.println("\nNet income:"+s1.getnetincome());
            System.out.println("Total number of the employee is :"+ employee.countemployees());
    }
}