import java.util.Random;
import java.util.Scanner;

public class easy {
    static Random rand = new Random();
    
    public static void easyDiff(){
        
        Scanner kbInput = new Scanner(System.in);    
    int points = 0;
    int wrong = 5;
    
    System.out.println("Easy Difficulty");
    do {
    int first = rand.nextInt(10);
    int second = rand.nextInt(10);
    int what = rand.nextInt(2);
    int answer;
    int guess;
    
    
    switch (what){
        case 0:
        answer = first+second;
    System.out.println(first + " + " + second + " = ?" );
    guess = kbInput.nextInt();
    if (answer == guess){   
    points++;
    System.out.println("Correct! Points = " + points);
    } else{
        wrong--;
    System.out.println("Wrong dumb! Answer was:" + answer+ " Try again.");
    System.out.println(wrong + " Attempts left");
     }
     break;
     case 1:
        answer = first-second;
    System.out.println(first + " - " + second + " = ?" );
    guess = kbInput.nextInt();
    if (answer == guess){   
    points++;
    System.out.println("Correct! Points = " + points);
    } else{
        wrong--;
    System.out.println("Wrong dumb! Answer was:" + answer+ " Try again.");
    System.out.println(wrong + " Attempts left");
     }
     break;
    } 
    }while(points < 2 && wrong != 0);
    if (wrong == 0) {
        System.out.println("Dang you suck! Start over.");
    } else{
        EndGame.endOfGame();
    }
    
        }
        
}
