import java.util.Scanner;
import java.util.*;


public class mathquiz {
    
    private static int choicewas;
    public int getChoicewas() {
        return choicewas;
    }
    public int incrementChoicewas() {
        return choicewas++;
    }

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in); 
        int difficulty;
        System.out.println("Choose your difficulty!\n1 = Easy\n2 = Medium\n3 = Hard");
       difficulty = kbInput.nextInt();
switch (difficulty){
    case 1:
    mathquiz.choicewas = 1;
    System.out.println("Easy Selected, Loading Questions.");
    easy.easyDiff();
    break;
    case 2:
    mathquiz.choicewas = 2;
    System.out.println("Medium Selected, Loading Questions.");
    medium.mediumDiff();
    break;
    case 3:
    mathquiz.choicewas = 3; 
    System.out.println("Hard Selected, Loading Questions.");
    hard.hardDiff();
}



    }
}