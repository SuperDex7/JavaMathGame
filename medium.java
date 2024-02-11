import java.util.Random;
import java.util.Scanner;

public class medium {
    
    public static void mediumDiff(){
        Random rand = new Random();
        Scanner kbInput = new Scanner(System.in);    
    int points = 0;
    int wrong = 3;
    System.out.println("Medium Difficulty. 3 Lives");
    do {
        int first = rand.nextInt(20);
        int second = rand.nextInt(20);
        int multfirst = rand.nextInt(6);
        int multsecond = rand.nextInt(6);
        int what = rand.nextInt(3);
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
        System.out.println("Wrong Answer! Answer was:" + answer+ " Try again.");
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
        System.out.println("Wrong Answer! Answer was:" + answer+ " Try again.");
        System.out.println(wrong + " Attempts left");
         }
         break;
         case 2:
            answer = multfirst*multsecond;
        System.out.println(multfirst + " X " + multsecond + " = ?" );
        guess = kbInput.nextInt();
        if (answer == guess){   
        points++;
        System.out.println("Correct! Points = " + points);
        } else{
            wrong--;
        System.out.println("Wrong Answer! Answer was:" + answer+ " Try again.");
        System.out.println(wrong + " Attempts left");
         }
         break;
        } 
        }while(points < 2 && wrong != 0);
        if (wrong == 0) {
            System.out.println("You Lost! Start over.");
        } else{
            EndGame.endOfGame();
        }
        
        }
        }
        