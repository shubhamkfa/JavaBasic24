public class Methods_97 {

    public static void main(String[]args){
        int a=1,b=5,c=19;

        c=b-a;

        System.out.println(c + " Is the answer ");

        method2();

    }

    public static void method2(){

        System.out.println("Method 2 inside main class only - non parameterized methods");
        Method3();
    }



    public static void Method3(){

        System.out.println("we can add N number of method inside main class");
    }

    public static void Method4(int x){
    System.out.println("Single Parameterized Methods");
    }
}
