import java.util.*;
public class IterativeStatementWhileloop {
    public static void main(String[]args){

//        int a =5;
//        int b=7;
//        while (a<b){
//            System.out.println("A is less than B");
//        }
        // for
//        for (int counter = 0; counter < 10; counter = counter + 1){
//            System.out.println("For Loop Three Times");
        //counter++->counter->counter+1
//            for (int counter = 0; counter < 11; counter++){
//                System.out.println(counter+"");
//
//        }
//            for (int i=0;i<12;i++){
//                System.out.println(i+" ");
//            }

//        int a =5,b=8;
//        while (a<b){
//            System.out.println("True STatement");
//            break;
//
//        }
//        int i=0;
//        do{
//            System.out.println(i);
//            i=i+1;
//        }while(i<10);


       // Que-1  #print thw Sum of n Natural Number
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;

        for (int i=0; i<=n; i++){
            sum=sum + 1;

        } System.out.print(sum);



    }
}
