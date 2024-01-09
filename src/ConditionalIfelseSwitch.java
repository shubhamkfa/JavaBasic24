import java.util.*;

import java.util.Scanner;

public class ConditionalIfelseSwitch {

    public static void main(String[]args){
        /*Scanner sc =new Scanner(System.in);
         int age =sc.nextInt();

        if (age<18){

            System.out.println("Not Adult");
        }else {
            System.out.println("Adult");
        }

*/

/*
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();

        if (n%2==0){
            System.out.println("even Number");
        }else{

            System.out.println("Odd Number");
        }

*/
       // Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
       // int b=sc.nextInt();
/*
        if (a==b){
            System.out.println("Equal");
        }else{
            if (a>b) {
                System.out.println("A is greater");
            }else{
                System.out.println("A is lesser");
            }

        }
*/ /*
        if (a==b){
            System.out.println("Equal");

        }else if (a>b){
            System.out.println("A is greter");
        }
        else{
            System.out.println("A is lesser");
        }
*/
       // if (3%2 ==0) {
        //    System.out.println("Bazinga");
        //}


        //Problem1

       // Scanner sc=new Scanner (System.in);
        //int button=sc.nextInt();

//        if (button==1){
//            System.out.println("Hello");
//        }else if (button==2){
//            System.out.println("Namaste");
//        }else if (button==3){
//            System.out.println("Bonjour");
//
//        }else {
//            System.out.println("Invilid Button");
//        }
//        switch (button){
//
//            case 1: System.out.println("Hello");
//            break;
//            case 2: System.out.println("Namaste");
//            break;
//            case 3: System.out.println("Bonjour");
//            break;
//            default : System.out.println("Invalid Button");
//
//        }
/* Homework
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.



        Scanner sc= new  Scanner ( System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

*/
        Scanner sc=new Scanner(System.in);
        int Month=sc.nextInt();

        switch (Month){
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("Septeber");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Invide button");

        }




    }
}
