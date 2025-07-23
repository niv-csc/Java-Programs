import java.util.*;
import java.lang.*;
class Bank{
      private String accname;
      private int accno;
      private float balance;
      Bank(String accname,int accno,float balance){
            this.accname=accname;
            this.accno=accno;
            this.balance=balance;
           }
      public void Withdraw(){
            System.out.print("\nEnter account for withdrawal");
            Scanner s=new Scanner(System.in);
            int ac=s.nextInt();
            if ((ac==accno)&& (balance!=0)){
                  System.out.print("\nEnter amount for withdrawal");
                  int amt=s.nextInt();
                  balance=balance-amt;
                  System.out.print("\nAmount Withdrawal complete");
                  System.out.print("\nRemaining Balance:"+balance);
                  }
            else{
                  System.out.print("withdrawal amount greater than balance");
                  System.out.print("Balance Remaining:"+balance);
                 }
       }
      public void Deposit(){
            System.out.print("\nEnter account for deposit");
            Scanner s=new Scanner(System.in);
            int ac=s.nextInt();
            if (ac==accno){
                  System.out.print("\nEnter amount for deposit");
                  int amt=s.nextInt();
                  balance=balance+amt;
                  System.out.print("\nAmount Deposit complete");
                  System.out.print("\nRemaining Balance:"+balance);
                  }
            else{
                  System.out.print("acc number entered wrong");
                 }
       }
       public int getAccount(){
                return accno;
       }
       public void Display(){
            System.out.print("\nEnter accno to check details");
            Scanner s=new Scanner(System.in);
            int ac=s.nextInt();
            if (ac==accno){
                    System.out.print("\nAccount no.:"+accno);
                    System.out.print("\nAccount name :"+accname);
                    System.out.print("\nBalance:"+balance);
                    }
            else{
                  System.out.print("acc number entered wrong");
                 }
       }
       public static void main(String[] args){
/*
             int bal;
             int acno;
             String acn;
             Scanner sc=new Scanner(System.in);
             System.out.print("\nEnter accno:");
             acno=sc.nextInt();
             sc.nextLine();
             System.out.print("\nEnter accname:");
             acn=sc.nextLine();
             System.out.print("\nEnter Balance of "+acno+":");
             bal=sc.nextInt();

             Bank obj=new Bank(acn,acno,bal);
             obj.Withdraw();
             obj.Deposit();
             obj.Display();
*/
             int n;
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter the number of users");
             n=sc.nextInt();
             sc.nextLine();
             Bank[] accounts=new Bank[n];
             for(int i=0;i<n;i++){
                    int acnos,bals;
                    String acns;
                    System.out.print("Enter accname:");
                    acns=sc.nextLine();
                    System.out.print("Enter accno:");
                    acnos=sc.nextInt();
                    System.out.print("Enter balance:");
                    bals=sc.nextInt();
                    sc.nextLine();
                    accounts[i]=new Bank(acns,acnos,bals);
                    }
             System.out.print("Enter the account number to search for:");
             int search=sc.nextInt();
             for(Bank asc:accounts){
                    if (asc.getAccount()==search){
                             asc.Withdraw();
                             asc.Deposit();
                             asc.Display();
                     } 
                           
             }

}
}
             
   
 
                    
            
