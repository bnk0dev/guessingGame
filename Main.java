import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        greeting();

        int guess = 0, num = 0;
        Random rd = new Random();
        int random =rd.nextInt(100);

        System.out.println("Press Y to start the game or Press N to Close the game");
        while(true){
            String enter = scan.nextLine();
            if(enter.equalsIgnoreCase("y")){
    
                while(true){
                    guess++;
                    System.out.print("guess: ");

                    try {
                        num = scan.nextInt();
                        if (num > random) {
                            System.out.print("Down - ");
                        } else if (num < random) {
                            System.out.print("Up - ");
                        } else {
                            System.out.println("Correct Answer the "+ guess+". Try");
                            System.out.println((100 / guess) + "% Successful");
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter an integer value.");
                        guess--;
                        scan.next();
                    }
                }
                break;
            }else if(enter.equalsIgnoreCase("n")){
                System.out.println("Exiting...");
                break;
            }else{
                System.out.println("Press Y or N, pls");
            }
        }
    scan.close();
    }

public static void greeting(){
    System.out.println("--------------------------------\nWelcome to Number Guessing Game\n--------------------------------\n"
    + "Rule: you have to guess the number kept between 0-100\n");
}
}
