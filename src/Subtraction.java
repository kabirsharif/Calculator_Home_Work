import java.util.Scanner;


public class Subtraction {

    Scanner scan=new Scanner(System.in);


    public double subtraction(){
        double val1=0, val2=0, val3=0, val4=0, val5=0;
        double noOfValues=0;
        double result=0;
        System.out.println("how many values would you like to subtract? ");
        noOfValues=scan.nextDouble();
        if(noOfValues==0){
            System.out.println(" Error, no values were entered.");
        }else if(noOfValues==1){
            System.out.println("Enter the first value : ");
            val1=scan.nextDouble();
            result=val1;
        }else if(noOfValues==2){
            System.out.println("Enter the first value : ");
            val1=scan.nextDouble();
            System.out.println("Enter the second value : ");
            val2=scan.nextDouble();
            result=val1-val2;
        }else if(noOfValues==3){
            System.out.println("Enter the first value : ");
            val1=scan.nextDouble();
            System.out.println("Enter the second value : ");
            val2=scan.nextDouble();
            System.out.println("Enter the third value : ");
            val3=scan.nextDouble();
            result=val1-val2-val3;
        }else if(noOfValues==4) {
            System.out.println("Enter the first value : ");
            val1 = scan.nextDouble();
            System.out.println("Enter the second value : ");
            val2 = scan.nextDouble();
            System.out.println("Enter the third value : ");
            val3 = scan.nextDouble();
            System.out.println("Enter the fourth value : ");
            val4 = scan.nextDouble();
            result = val1 - val2 - val3 - val4;
        }else if(noOfValues==5) {
            System.out.println("Enter the first value : ");
            val1 = scan.nextDouble();
            System.out.println("Enter the second value : ");
            val2 = scan.nextDouble();
            System.out.println("Enter the third value : ");
            val3 = scan.nextDouble();
            System.out.println("Enter the fourth value : ");
            val4 = scan.nextDouble();
            System.out.println("Enter the fifth value : ");
            val5 = scan.nextDouble();
            result = val1 - val2 - val3 - val4 - val5;
        }else {
            System.out.println("Error! too many values. I can only work with 5 values at the moment.");
            System.out.println("Enter the first value : ");
            val1 = scan.nextDouble();
            System.out.println("Enter the second value : ");
            val2 = scan.nextDouble();
            System.out.println("Enter the third value : ");
            val3 = scan.nextDouble();
            System.out.println("Enter the fourth value : ");
            val4 = scan.nextDouble();
            System.out.println("Enter the fifth value : ");
            val5 = scan.nextDouble();
            result = val1 - val2 - val3 - val4 - val5;
        }

        return result;
    }


    public static void main(String Args[]){

//        Subtraction add=new Subtraction();
//        System.out.println("The result of Subtraction operation is : "+add.subtraction());


    }
}
