import java.util.Scanner;

public class Question3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double[] array = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};

        System.out.println("Enter First index: ");
        int user1 = scanner.nextInt();

        System.out.println("Enter Second index: ");
        int user2 = scanner.nextInt();

        double temp;

        temp = array[user1];
        array[user1]=array[user2];
        array[user2]=temp;

        for(double num: array){
            System.out.println(num);
        }
    }
}