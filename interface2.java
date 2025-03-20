import java.util.*;
/*interface account
{
    void deposit();
    void withdraw();
    void calculate_interest();
}
class CurrentAccount implements account
{
    void deposit()
    {
        
    }
    void withdraw()
    {
        
    }
    void Calculate_interest()
    {
        
    }
}
class SavingAccount implements account
{
    void deposit()
    {
        
    }
    void withdraw()
    {
        
    }
    void Calculate_interest()
    {
        
    }
}*/
class Bank
{
    void Account(String[] accountname,int[] accountno,int numberofaccount)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the account holder: ");
        String name=s.nextLine();
        System.out.println("Enter the account number: ");
        int acno=s.nextInt();
        accountname[numberofaccount] = name;
        accountno[numberofaccount] = acno;
        System.out.println("Account added successfully!");
    }
}
public class interface2
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int size=2;
		int[] accountno=new int[size];
		String[] accountname=new String[size];
        boolean loop=true;
        int numberofaccount=0;
        while (loop)
        {
            System.out.println("1.Add Account");
            System.out.println("2.Saving Account");
            System.out.println("3.Current Account");
            System.out.println("4.EXIT");
            int choice = s.nextInt();
            switch(choice)
            {
                case 1:
                {
		          Bank bank = new Bank();
                  bank.Account(accountname,accountno,numberofaccount);
                  numberofaccount++;
                  System.out.println("no"+numberofaccount);
                  if(numberofaccount==size)
                  {
                      size*=2;
                     int[] temp1=accountno;
                      String[] temp2=accountname;
                      accountname =new String[size];
                      accountno =new int[size];
                      accountname=temp2;
                      accountno=temp1;
                    }
                    System.out.println(size);
                  for(int i=0;i<accountname.length;i++)
                  {
                    System.out.println(accountname[i]);
                    System.out.println(accountno[i]);
                  }
                }
		//SavingAccount savingaccount = new SavingAccount();
       // CurrentAccount currentAccount = new CurrentAccount();
            }
        }
	}
}
