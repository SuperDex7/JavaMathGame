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
    main.incrementChoicewas();
    
    medium.mediumDiff();

 } else if(main.getChoicewas() == 2){
    main.incrementChoicewas();
hard.hardDiff();
        } else if(main.getChoicewas() == 3){
            main.incrementChoicewas();
            insane.insaneDiff();
    }
}
}
}