import java.util.*;

public class PracticeSet1DataTypes {


    public static void main(String[] args) {

        //Examples from https://toolsqa.com/java/data-types-variables/
        //1. Write a Java program to print "Hello World" on the screen.
        //Scanner sc = new Scanner (System.in);
        //int a = sc.nextInt();
        //String s= sc.next();
        //System.out.println(s+ " ");

        //System.out.println("Hello World");
        //System.out.println('a');

        // 2. Write a Java program to print the following output:

//        System.out.println("@@@@@@");
//        System.out.println("++++++");
//        System.out.println("*****");
//        System.out.println("######");

        //3. Write a Java program to declare three variable
        // a, b, & c and store the values respectively 10, 20.3 & 3.14785 .
        // Then display their values on the screen.


//        int a=10;
//        double b= 20.3;
//        double c=3.14785;
//
//        System.out.println("The value of a is : "+ a);
//        System.out.println("The value of b is : "+ b);
//        System.out.println("The value of c is : "+ c);


//       Example 4. Write a Java program to declare
//        a Boolean variable with initial value of "true"
//        and later change it to "false" before printing it.

//        Boolean a = true;
//
//        a=false;
//
//        System.out.println("The boolean value of variable a is : " + a);


//        Scanner sc= new Scanner (System.in);
//        int g = sc.nextInt();




        //OPERATOR
        //Arithmetic operators perform the same basic operations you would expect if you used them in mathematics.
        // They take two operands and return the result of the mathematical calculation.
        // There are seven important arithmetic operators available in Java:
       /* Addition '+' : This adds two numbers or concatenate two strings
        Subtraction '-' : This subtracts right-side operand from the left side operand
        Multiplication '*' : This multiplies two numbers
        Division '/' : This divides left side operand by the right side operand
        Modulo '%' : This divides left side operand by the right side operand and returns the remainder
        Increment '++' : This increases the value by 1
        Decrement '- -' : This decreases the value by 1



                int a, b = 10, c = 5;
                a = b + c;
                System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
                a = b - c;
                System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
                a = b * c;
                System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
                a = b / c;
                System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
                a = b % c;
                System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
                b++;
                System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
                c--;
                System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);

*/


        //Relational operator are used to determine the comparison between two or more object
        //These operators always return the boolean values either true or false when used is an expression
        //in java we have 6 different relational operator

        /*
        Greater than > :  This checks the value of left operands is greater than value of right operands
        Less than < :  This checks the value of left operands is smaller than value of right operands.
        Greater than or equal to >= : This check the value of left operands is Greater than or equals to value of right operands
        Less than or equals to <= : This check the value of left operand is Less than or equals too value of right operands
        Equal == : This check the value of both operands are equal
        Not Equal != : This check the value of two operands are not equal


        int Ten = 10;
        int Twenty = 20;
        int Thirty = 30;

        System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
        System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); //false
        System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); //true
        System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); //true

        System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
        System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); //false
        System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); //true
        System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); //true

        System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
        System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); //true
        System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); //false
        System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); //false

        //less than or equal to
        System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
        System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); //true
        System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); //false
        System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); //false

        //equal to
        System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
        System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); //false
        System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); //true

        //not equal to
        System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
        System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); //true
        System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); //false


*/

/*      Logical operators in Java

        Logical operators is returs true or false based on the state of the variable,
        Each argument to a logical operator must be a boolean data type,
         and the result will always be the boolean data type.

         And Operator && : This returns true if the output of both the operators is true
         Or operator || : This returns true if output of either operands are ture
         NOT operator !: This inverts the state of condition

        boolean Output_1 = true;
        boolean Output_2 = false;
        //System.out.println("Check if both the boolean variable are false : "+ (Output_1 || Output_2));
        System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
        System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
        System.out.println("Change the state of the Output_1 to false : " + (!Output_1));


*/
/*
        int Ten = 10;
        int Twenty = 20;
        int Thirty = 30;
        boolean bValue;
        int iValue;
        int t;

        t=(Ten>Thirty) ? 10:20;
        System.out.println("Value of the variable is :" + t);

        bValue = (Thirty == Twenty + Ten) ? true: false;
        System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); //true

        iValue = ((Thirty == Twenty + Ten)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + iValue ); //50

        //This is a use of Not Logical Operator
        iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + iValue ); //100

*/

        //If
/*
        String sDay = "Sunday";
        int iDay = 7;

        if(sDay.equals("Sunday")){
            System.out.println("Today is Sunday");
        }

        if(iDay==7){
            System.out.println("Today is Sat");
        }
*/
/*
        String sday="Saturday";
        int iday=6;

        if (sday.equals("saturday")){

            System.out.println("Today is Saturday");
        }else {
            System.out.println("today is sunday");

        } if (iday==7){
            System.out.println("Today is Saturday");

        }else {
            System.out.println("Today is not Saturday");
        }
 */
        String sday="Monday";
        int mday=1;

        if (sday .equals("Sunday")){
            System.out.println("TOday is Sunday");

        } else if (sday!="Monday"){
            System.out.println("Today is Monday");
        }else {
            System.out.println("Today is holiday");
        }

    }




}
