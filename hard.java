import java.util.Scanner;
import java.util.Random;
public class hard {
    
    public static void hardDiff(){
        Random rand = new Random();
    Scanner kbInput = new Scanner(System.in);    
int points = 0;
do {
int first = rand.nextInt(30);
int second = rand.nextInt(30);
int multfirst = rand.nextInt(12);
int multsecond = rand.nextInt(12);
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
    answer = multfirst*multsecond;
System.out.println(multfirst + " X " + multsecond + " = ?" );
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
