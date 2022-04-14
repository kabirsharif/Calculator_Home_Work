import java.util.Scanner;

public class Calculator {

    // this is Sharif. Here i only tried to use codes which were covered/taught by Mahmud Bhi and TajWarrior.
    // therefore this calc engine has limitations. to be a human is to err. Overlook the limitations and enjoy :)
    // much love.
    public static void main(String Args[]) {

        Scanner scan = new Scanner(System.in);
        int typeOfOperation;

        System.out.print("\n\n********* <3 Welcome to Calc Engine by Mahmud & the gang. :) <3 ********* \n\nwhat kind of operation would you like to perform?\n");
        System.out.println("If you want to perform Addition, Enter 1 .");
        System.out.println("If you want to perform Subtraction, Enter 2 .");
        System.out.println("If you want to perform Multiplication, Enter 3 .");
        System.out.println("If you want to perform Division, Enter 4 .");

        typeOfOperation = scan.nextInt();

        if (typeOfOperation == 1) {
            Addition add = new Addition();
            System.out.println("The result of Addition operation is : " + add.addition());
        } else if (typeOfOperation == 2) {
            Subtraction sub = new Subtraction();
            System.out.println("The result of Subtraction operation is : " + sub.subtraction());
        } else if (typeOfOperation == 3) {
            Multiplication mul = new Multiplication();
            System.out.println("The result of Multiplication operation is : " + mul.multiplication());
        } else if (typeOfOperation == 4) {
            Division div = new Division();
            System.out.println("The result of Division operation is : " + div.division());
        } else {
            System.out.println("Operation type unknown. \n\nBe a good sport and enter \n1 for Addition or \n2 for Subtraction or \n3 for multiplication or \n4 for Division.");
            typeOfOperation = scan.nextInt();

            if (typeOfOperation == 1) {
                Addition add = new Addition();
                System.out.println("The result of Addition operation is : " + add.addition());
            } else if (typeOfOperation == 2) {
                Subtraction sub = new Subtraction();
                System.out.println("The result of Subtraction operation is : " + sub.subtraction());
            } else if (typeOfOperation == 3) {
                Multiplication mul = new Multiplication();
                System.out.println("The result of Multiplication operation is : " + mul.multiplication());
            } else if (typeOfOperation == 4) {
                Division div = new Division();
                System.out.println("The result of Division operation is : " + div.division());
            } else {
                System.out.println("Operation type unknown. Calc Engine terminating. \n Please rerun the code! oh and REMEMBER, i cant help you if you do not follow instructions :( ");
            }
        }
    }
}