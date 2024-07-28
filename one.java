import java.util.Scanner;

class one{
    public static void main(String[] args) {
        int computerScore = 0, userScore = 0;
       String choice ;
        Scanner input = new Scanner(System.in);
       // int computerChoice =(int) (Math.random() *100);
         int chances =0;   
         
        do{

            int computerChoice =(int) (Math.random() *100);

            System.out.println("Please enter your choice");
            int userChioce = input.nextInt();
    
            if(computerChoice == userChioce){
                System.out.println("Your choice is " + userChioce + " and computer choice is " + computerChoice);
                System.out.println("It's a tie. No effects on score ");
            }else if(userChioce > computerChoice){
                System.out.println("Your choice is " + userChioce + " and computer choice is " + computerChoice);
                System.out.println("Your number is High , you get 1 point");
                 userScore++;
            }else{
                System.out.println("Your choice is " + userChioce + " and computer choice is " + computerChoice);
                System.out.println("Your number is low, Computer get 1 point");
                computerScore++;
            }

            input.nextLine();
            System.out.println("Do you want to play again ? YES OR NO");
            choice= input.nextLine(); 
              
            chances++;
            
        }while((choice.equals("yes") || choice.equals("YES")) && chances < 3);

        if(chances>=3){
            System.out.println("GAME END , forcefully as you can only play 3 turns in a single run");
            System.out.println("Your final sCORE IS " + userScore + " and computer final score is " + computerScore);

            if(userScore> computerScore){
              System.out.println("You won");
            }else{
              System.out.println("You lose");
            }
        }else{
            System.out.println("GAME END");

            System.out.println("Your final sCORE IS " + userScore + " and computer final score is " + computerScore);
    
            if(userScore> computerScore){
              System.out.println("You won");
            }else{
              System.out.println("You lose");
            }
    
        }        
    }
}