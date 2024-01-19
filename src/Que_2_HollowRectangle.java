
import java.util.Scanner;


//Que 2- Print Hollow Rectangle - Apana school Lecture 5

public class Que_2_HollowRectangle {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int r=sc.nextInt();

//        int c=4;
//        int r=5;
        //outer loop will print Rows
        for(int i=1; i<=c; i++ ){
            //inner loop - print column
            for (int j=1;j<=r;j++){
                if (i == 1 || j == 1 || i == c||j == r) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");

                }
            } System.out.println();

        }



    }

}
