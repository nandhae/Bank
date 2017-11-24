import java.util.Scanner;

public class Customer {
    int id;
    String name;
    Account account =new Account();
    Scanner scanner=new Scanner(System.in);




    public void deposit(){
    System.out.println("Enter the amount!!!");
    account.balance+=scanner.nextInt();
    }

    public void withdraw(){
    System.out.println("Enter the amount!!!");
    int temp=scanner.nextInt();
    if(account.balance-temp<500){
        System.out.println("Insufficient Balance!!!");
    }else {
        account.balance-=temp;
    }
    }
    public void display(){
        System.out.println("Customer ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Account NO: " + account.accountNum);
        System.out.println("Account Balance: " + account.balance);

    }
}
