import java.util.Scanner;

public class Division {

    Scanner scan=new Scanner(System.in);
    public double division() {
        double val1 = 0, val2 = 0;
        double result = 0;

        System.out.println("Enter the first value : ");
        val1 = scan.nextDouble();
        System.out.println("Enter the second value : ");
        val2 = scan.nextDouble();

        if (val2 != 0) {
            result = val1 / val2;
        } else {
            System.out.println("The divider/second value must NOT be zero! please re-enter second value : ");
            val2 = scan.nextDouble();
            if (val2 != 0) {
                result = val1 / val2;
            } else {
                System.out.println("The divider/second value must NOT be zero! \n PLEASE re-enter second value (last chance!) : ");
                val2 = scan.nextDouble();
                if (val2 != 0) {
                    result = val1 / val2;
                } else {
                    System.out.println("Due to user inability of following instruction, the calc engine is terminating.\n Please rerun the code if needed.");
                    result = 0;
                }
            }
        }
        return result;
    }
    public static void main(String Args[]){

//        Division add= new Division();
//        System.out.println("The result of Division operation is : "+add.division());


    }



}
