import java.util.Scanner;
import java.util.Random;
public class insane {
    
    public static void insaneDiff(){
        Random rand = new Random();
    Scanner kbInput = new Scanner(System.in);    
int points = 0;
int wrong = 1;
System.out.println("Hidden Insane Difficulty!!");
do {
int first = rand.nextInt(1000);
int second = rand.nextInt(1000);
int multfirst = rand.nextInt(20);
int multsecond = rand.nextInt(20);
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
 case 2:
    answer = multfirst*multsecond;
System.out.println(multfirst + " X " + multsecond + " = ?" );
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
}while(points < 10);
if (wrong == 0) {
    System.out.println("Dang you suck! Start over.");
} else{
    System.out.println("You beat the hardest difficulty!");
}
}
}