import java.util.Scanner;



public class Question1NestedLoop_SolidRectangle {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(); //n=4
    int m=sc.nextInt(); //m=5


        for(int i=1;i<=n;i++){

            for(int j=1;j<=m;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }


    }
}
