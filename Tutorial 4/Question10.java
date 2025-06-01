import java.util.Scanner;

public class Question10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x =6;
        int[] array=new int[x];
        for(int i=0;i<x;i++){
            System.out.println("Enter Integer: ");
            int user=scanner.nextInt();
            array[i]=user;
        }

        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();

        for(int j=0;j<x-1;j++){
            array[j]=array[j+1];
        }
        //last one make zero primitive data types cant be null.
        array[x-1]=0;
        for(int num:array){
            System.out.print(num+" ");
        }
    }
}