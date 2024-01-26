import java.util.Scanner;
public class EndGame {
    
    
    public static void endOfGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to up the difficulty and restart?\n Yes = 1\n No = 0.");
        int choice = scan.nextInt();
        if (choice == 0){
            System.out.println("Thank you for playing!");
        } else if (choice == 1){

        }
    }
}
