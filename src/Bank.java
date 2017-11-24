import java.util.Scanner;

public class Bank {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ch;
        Manager manager=new Manager();

        while (true){
            System.out.println("Enter your choice!!!\n1.Create \n2Transaction");
            ch= scanner.nextInt();
            switch (ch){

                case 1:
                    manager.createCustomer();
                    break;
                case 2:
                    manager.transaction();
                    break;


            }
        }

    }
}
