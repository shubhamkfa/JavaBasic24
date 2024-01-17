public class ArrayW3 {
    public static void main(String[]args){

        String[] cars ={"Volvo","BMW","Farari","Audi","Mercedis"};
        for(int i=0;i < cars.length;i++){
            System.out.println(cars[i]);
        }

        String[]cars1={"Volvo","BMW","Audi"};
        for(String i:cars1){
            System.out.println(i);
        }

    }
}
