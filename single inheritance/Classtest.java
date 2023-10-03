class Bankaccount{
    int ID;
    double Balance;
    String  holderName ;
    static int count;
    {
        count++;
    }

Bankaccount ()
{
    ID=0;
    Balance=0;
    holderName ="NULL";

}
Bankaccount (int aid,double balance, String HN)
{
        ID= aid;
        Balance = balance;
        holderName = HN;

}

void  printBankaccount()
{
    System.out.println("Id:"+ID+"HolderName:"+holderName+"\t"+"balance:"+ Balance);
}
static int countBankAccounts()
{
    return count;
}
 void withdraw(double amount)
{
    if(amount>0 && amount<=Balance)
    {
        Balance-=amount;
        System.out.println(amount+"has been successfully withdrawn");
    } else
    System.out.println("The withdrawal failed");
}
  void deposit(double amount) 
    {
        if (amount > 0) 
        {
            Balance += amount;
            System.out.println( amount + " deposited successfully.");
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

void Transfer(Bankaccount destination , int amount)
{
    if(amount>0 && amount<=Balance)
    {
        withdraw(amount);
        destination.deposit(amount);
        System.out.print(amount+"has been transferred to"+destination.holderName+"sccessufully");
    } 
    else 
    { 
        System.out.print("transferred failed!");
    }
}


}
class Classtest{
    public static void main(String[]args)
    {
        Bankaccount a1= new Bankaccount(12345, 25000, "Shreya");
         Bankaccount a2= new Bankaccount(12, 25000, "ansh");
         Bankaccount a3= new Bankaccount(10,00,"darshil");

System.out.println("THE INITIAL BALANCE OF THE USER:");
         a1.printBankaccount();
        a2.printBankaccount();
        a3.printBankaccount();


a1.withdraw(20);
a3.deposit(5000);
a2.Transfer(a3, 520);

System.out.println("THE FINAL BALANCE OF THE USER:");
         a1.printBankaccount();
        a2.printBankaccount();
        a3.printBankaccount();


System.out.print(Bankaccount.countBankAccounts());
    }



}