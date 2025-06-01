public class Question2{
    public static void main(String[] args){
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};
        int firstSwapIndex=0;
        int secondSwapIndex=2;
        String temp ;

        temp=array[firstSwapIndex];
        array[firstSwapIndex]=array[secondSwapIndex];
        array[secondSwapIndex]=temp;


        for(String element: array){
            System.out.println(element);
        }


    }
}