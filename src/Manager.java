import java.util.Scanner;

public class Manager {
     Customer[] customers = new Customer[10];

     int noOfCus;
     Scanner scanner =new Scanner(System.in);

    public void createCustomer(){
        for ( int i=0; i<customers.length; i++) {
            customers[i]=new Customer();
        }

        System.out.println("Enter the num of customers you want to create!!!");
        noOfCus= scanner.nextInt();
        int temp;
        for (int i=0;i< noOfCus;i++){
            customers[i].id=i;
            System.out.println("Enter the name of the customer!!");
            customers[i].name = scanner.nextLine();
            customers[i].name = scanner.nextLine();
        do{
            System.out.println("Enter the amount you want to put as initial deposit!!");
            temp=scanner.nextInt();
            if(temp <500 ){
                System.out.println("Initial deposit can not be less than 500!!!");
            }
            else {
                customers[i].account.balance = temp;
            }
        }while (temp<500);
        }

    }

    public void  transaction(){
        System.out.println("Enter the customer id of the account u want to access!!!");
        int tempID=scanner.nextInt();
            System.out.println("Enter the task you want to perform!!!\n1.CheckInfo\n2.Deposit\n3.Withdraw\n4.Exit");
            int ch=scanner.nextInt();
            switch (ch){
                case 1:
                    customers[tempID].display();
                    break;
                case 2:
                    customers[tempID].deposit();
                    break;
                case 3:
                    customers[tempID].withdraw();
                    break;
                default:
                    break;


            }

    }
}
