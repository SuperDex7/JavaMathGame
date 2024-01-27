import java.util.Scanner;
public class EndGame {
    
    
    public static void endOfGame() {
        mathquiz main = new mathquiz();
        int diff = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to up the difficulty and restart?\n Yes = 1\n No = 0.");
        //System.out.println("choice was:" + diff);
        int choice = scan.nextInt();
        if (choice == 0){
            System.out.println("Thank you for playing!");
        } else if (choice == 1){
            
 if(main.getChoicewas() == 1){
    diff = 2;
    medium.mediumDiff();

 } else if(diff == 2){
    diff = 3;

hard.hardDiff();
        } else if(diff == 3){
            diff = 4;
            insane.insaneDiff();
    }
}
}
}