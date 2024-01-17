public class PracticSet2_Pattern {

    public static void main(String[]args){

        //Print pattern - Apana college Lecture5
        //*****
/*
        for( int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
                System.out.print("*");
            }

        }System.out.println("*");




*/ // Nested if
 /*
        int n=4;
        int m=5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");

            } System.out.println("*");
        }

  */
/*        //Question 2-Print Hollow Rectangle

        int n=4;
        int m=5;

        for (int i=1; i<=n; i++){
            for( int j=1; j<=m; j++) {
                if (i == 1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }System.out.println();

        }
*/

/* Half Pyramin

        int n=4;

        for(int i=1;i<=n; i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

    //Inverted Half Pyramid

//        int n=4;
//        for(int i=n; i>=1; i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }System.out.println();
//        }

        for(int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*"+ " ");

            }System.out.println();
        }


    }

}
