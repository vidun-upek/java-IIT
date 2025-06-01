import java.util.Scanner;

public class CreateArray{
    public static void main(String[] args){

        int[] myArray = new int[6];

        Scanner scanner = new Scanner(System.in);
        int userMark;
        for(int i =0;i<myArray.length;i++){
            System.out.println("Enter Mark"+(i+1)+": ");
            userMark = scanner.nextInt();
            myArray[i]=userMark;
        }
        myArray[0]=100;
        for(int num: myArray){
            System.out.println("Marks Entered are: "+ num);
        }
        int count=0;
        int total=0;
        for(int num: myArray){
            if(num<=40){
                count++ ;
            }
            total+=num;
        }
        System.out.println("Total Fail Students: "+ count);
        System.out.println("Total Mrks of  Students: "+ total);
        
    }
}