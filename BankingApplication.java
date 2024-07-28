import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        BankAccount Customer2 = new BankAccount("Sourabh","AEV0014");
        Customer2.ShowMenu();
    
        
    }
}

class BankAccount{
int balance ;
int previousTransation;
String customerName; 
String customerId;


BankAccount(String cname,String cid)
{
    customerName = cname;
    customerId = cid;
}

void deposit(int amount)
{
if (amount !=0)
{
    balance = balance + amount;
    previousTransation = amount;
}

}
void withdraw(int amount)
{
    if(amount != 0)
    {
        balance = balance - amount;
        previousTransation= -amount;
}
    }

    void getpreviousTransaction()
    {
        if(previousTransation > 0)
        {
            System.out.println("deposited: " +previousTransation);
        }
        else if (previousTransation < 0)
        {
            System.out.println("withdrawn:" +Math.abs(previousTransation));
        }
        else 
        {
            System.out.println("No Transaction Occured");
        }
    }
    
    void ShowMenu()
    {
        char option='\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " +customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D. previousTransaction");
        System.out.println("E. Exit ");


        do
        {
            System.out.println("Enter an option");
            option = scanner.next().charAt(0);
            System.out.println("\n");


            switch (option)
             {
                case 'A':
                System.out.println("balance = " +balance);
                System.out.println("\n");
                     break;
                     
                case 'B' :
                System.out.println("Enter an amount to deposit:");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                     break;
                
                case 'C' :
                System.out.println("Enter an amount to withdraw:");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                     break;

                case 'D' :
                getpreviousTransaction();
                System.out.println("\n");
                     break;

                case 'E' :
                System.out.println("**************************");  
                     break;  


            
                default:
                System.out.println("Invalid Option!!. Please enter again");
                    break;
            }

        }while(option !='E');

        System.out.println("thankYou for using our services");

            

    }


    }




