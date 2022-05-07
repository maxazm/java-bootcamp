import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        int cprResult = addResult(roll1, roll2, roll3);

        System.out.println("Enter three numbers between 1 and 6");

        int userNum1 = scan.nextInt();
        int userNum2 = scan.nextInt();
        int userNum3 = scan.nextInt();

        boolean inputValidation = isValid(userNum1, userNum2, userNum3);

        if(!inputValidation) System.exit(0);

        int userResult = addResult(userNum1, userNum2, userNum3);

        printDice(roll1);
        printDice(roll2);
        printDice(roll3);

        winnerPrint(userResult, cprResult);

        scan.close();
    }

    public static int rollDice(){
        int randomNumber = (int)(Math.random() * 6);

        switch(randomNumber){
            case 0: randomNumber += 1;
            default: return randomNumber;
        }
    }

    public static void printDice(int result){
        System.out.println(result);
    }

    public static int addResult(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static boolean isValid(int num1, int num2, int num3){
        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1. Shutting game down");
            return false;
        }
        else if(num1 > 6 || num2 > 6 ||num3 > 6){
            System.out.println("Numbers cannot be greater than 6. Shutting game down");
            return false;
        }
        else return true;
    }

    public static void winnerPrint(int userResult, int cprResult){
        if(userResult > cprResult) {
            System.out.println("Congrats!, you win! Your result is " + userResult + " and cpr's result is " + cprResult);
        }
        else if(cprResult > userResult){
            System.out.println("You lost! Your result is " + userResult + " and cpr's result is " + cprResult);
        }
        else{
            System.out.println("It's a draw...");
        }

    }
}
