import java.util.*;

public class oddsOrEvens {

    public static Scanner input = new Scanner(System.in);
    public static int player;
    public static int computer;
    public static int sum;
    public static String userChoose;
    public static String name;

    public static void main (String [] args){
        pick();
        play();
        result();
    }

    public static void pick(){
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        name = input.next();
        System.out.print("Hi "+ name +", which do you choose? (O)dds or (E)vens? ");
        int count =0;
        while (count!=1){
             userChoose = input.next();
            if (userChoose.equalsIgnoreCase("O")){
                count++;
                System.out.println(name+" has picked odds! The computer will be evens.");
            } else if (userChoose.equalsIgnoreCase("E")){
                count++;
                System.out.println(name+" has picked evens! The computer will be odds.");
            } else {
                count=0;
                System.out.println("Please enter the userchoose again. One of these \"O\" or \"E\"!");
            }
        }
        for (int i=0;i<15;i++) System.out.print("-");
        System.out.println();
    }

    public static void play(){
        System.out.print("How many \"fingers\" do you put out? ");
        player = input.nextInt();
        Random rand = new Random();
        computer = rand.nextInt(6);
        System.out.println("The computer play "+ computer +" \"fingers\".");
        for (int i=0;i<15;i++) System.out.print("-");
        System.out.println();
    }

    public static void result(){
        sum = player+computer;
        String check;
        System.out.println(player + " + " + computer +" = "+ sum);
        if (sum%2==0) {
            System.out.println(sum +" is .... "+ "even!");
            check = "E";
            if (check.equalsIgnoreCase(userChoose)) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means computer wins! :(");
            }
        } else {
            System.out.println(sum + "is .... "+ "odds!");
            check = "O";
            if (check.equalsIgnoreCase(userChoose)){
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means computer wins! :(");
            }
        }
        for (int i=0;i<15;i++) System.out.print("-");
        System.out.println();
    }
}
