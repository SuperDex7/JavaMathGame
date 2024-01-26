import java.util.Random;
import java.util.Scanner;

public class medium {
    
    public static void mediumDiff(){
        Random rand = new Random();
        Scanner kbInput = new Scanner(System.in);    
    int points = 0;
    do {
    int first = rand.nextInt(20);
    int second = rand.nextInt(20);
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
    System.out.println("Wrong dumb! Answer was:" + answer+ " Try again.");
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
    System.out.println("Wrong dumb! Answer was:" + answer+ " Try again.");
     }
     break;
     case 2:
        answer = first*second;
    System.out.println(first + " X " + second + " = ?" );
    guess = kbInput.nextInt();
    if (answer == guess){   
    points++;
    System.out.println("Correct! Points = " + points);
    } else{
    System.out.println("Wrong dumb! Answer was:" + answer+ " Try again.");
     }
     break;
    } 
    }while(points < 10);
    }
}