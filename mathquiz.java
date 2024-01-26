import java.util.Scanner;
import java.util.*;

public class mathquiz {
    

    public static void main(String[] args) {
int choicewas;
        Scanner kbInput = new Scanner(System.in); 
        int difficulty;
        System.out.println("Choose your difficulty!\n1 = Easy\n2 = Medium\n3 = Hard");
       difficulty = kbInput.nextInt();
switch (difficulty){
    case 1:
    choicewas = 1;
    System.out.println("Easy Selected, Loading Questions.");
    easy.easyDiff();
    break;
    case 2:
    choicewas = 2;
    System.out.println("Medium Selected, Loading Questions.");
    medium.mediumDiff();
    break;
    case 3:
    choicewas = 3; 
    System.out.println("Hard Selected, Loading Questions.");
    hard.hardDiff();
}



    }
}