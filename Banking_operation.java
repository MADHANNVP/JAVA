import java.util.*;
class Banking_operation{
    public static void balance(String[] name ,int[] amound ,int[] accounnumber)
    {
        Scanner s=new Scanner(System.in);
        int b=0;
        System.out.println("Enter the Account number");
        int a=s.nextInt();
        for(int i=0;i<name.length;i++)
        {
        if(accounnumber[i]==a)
        {
        System.out.println("****************************************************************************************");
        System.out.println("Balance Amound "+amound[i]);
        System.out.println("****************************************************************************************");
        b++;
        }
        }
        if(b==0)
        {
            System.out.println("Accound is not founded");
        }
    }
    public static void deposit(String[] name , int[] accoundno , int[] amound)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name");
        String n=s.nextLine();
        System.out.println("Enter the Account number");
        int a=s.nextInt();
        System.out.println("Enter the Amound");
        int b=s.nextInt();
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(n) && accoundno[i]==a)
            {
                    amound[i]+=b;
                    break;
                    
            }
        }
    }
    public static void withdrawn(String[] name , int[] accoundno , int[] amound)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name");
        String n=s.nextLine();
        System.out.println("Enter the Account number");
        int a=s.nextInt();
        System.out.println("Enter the Amound");
        int b=s.nextInt();
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(n) && accoundno[i]==a)
            {
                amound[i]-=b;
                System.out.println("Balance Amound is"+amound[i]);
                break;
            }
        }
    }
    public static void transfer(String[] name , int[] accoundno , int[] amound)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name");
        String n=s.nextLine();
        System.out.println("Enter the Account number");
        int a=s.nextInt();
        System.out.println("Enter the transfer Amount");
        int b=s.nextInt();
        s.nextLine();
        System.out.println("Enter the recipient of the money");
        String m=s.nextLine();
        System.out.println("Enter the recipient Account number");
        int x=s.nextInt();
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(n) && accoundno[i]==a)
            {
                amound[i]-=b;
                for(int j=0;j<name.length;j++)
                {
                    if(name[j].equals(m) && accoundno[j]==x)
                    {
                        amound[j]+=b;
                        break;
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        int run=100;
        int accno,amount=0,choice,size=1;
        String accname,address;
        String[] name=new String[100];
        int[] accoundno=new int[100];
        int[] amound=new int[100];
        System.out.println("Welcome To Indian Bank");
        System.out.println("Acc_no");
        accno=s.nextInt();
        s.nextLine();
        System.out.println("Acc_Holder_Name;");
        accname=s.nextLine();
        System.out.println("Address");
        address=s.nextLine();
        System.out.println("Initial_Amount");
        amount=s.nextInt();
        name[size-1]=accname;
        accoundno[size-1]=accno;
        amound[size-1]=amount;
        while (40<run){
        System.out.println("1.Add Another Account");
        System.out.println("2.Balance");
        System.out.println("3.Deposit");
        System.out.println("4.Withdrawn");
        System.out.println("5.Transfer");
        System.out.println("6.Exit");
        System.out.println("Enter the choice");
        choice=s.nextInt();
        switch(choice)
        {
        case 1:
            {
              size++;
              System.out.println("Acc_no");
              accno=s.nextInt();
              s.nextLine();
              System.out.println("Acc_Holder_Name;");
              accname=s.nextLine();
              System.out.println("Address");
              address=s.nextLine();
              System.out.println("Initial_Amount");
              amount=s.nextInt();
              name[size-1]=accname;
              accoundno[size-1]=accno;
              amound[size-1]=amount;
              break;
            }
        case 2:
        {
            balance(name,amound,accoundno);
            break;
        }
        case 3:
        {
            deposit(name,accoundno,amound);
            break;
        }
        case 4:
        {
            withdrawn(name,accoundno,amound);
            break;
        }
        case 5:
        {
            transfer(name,accoundno,amound);
            break;
        }
        case 6:
        { 
            run=0;
            break;
        }
        }
    }
}
}
