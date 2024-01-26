import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class mathquiz {
    static Random rand = new Random();


    public static void easy(){
    Scanner kbInput = new Scanner(System.in);    
int points = 0;
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
} 
}while(points < 10);
    }
public static void medium(){
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


public static void hard(){
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
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in); 
        int difficulty;
        System.out.println("Choose your difficulty!\n1 = Easy\n2 = Medium\n3 = Hard");
       difficulty = kbInput.nextInt();
switch (difficulty){
    case 1:
    System.out.println("Easy Selected, Loading Questions.");
    easy();
    break;
    case 2:
    System.out.println("Medium Selected, Loading Questions.");
    medium();
    break;
    case 3:
    System.out.println("Hard Selected, Loading Questions.");
    hard();
}



    }
}