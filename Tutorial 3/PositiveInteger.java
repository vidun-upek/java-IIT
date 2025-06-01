import java.util.Scanner;
public class PositiveInteger {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Positive number: ");
        int num=scanner.nextInt();

        System.out.println("Enter letter: ");
        char letter=scanner.next().charAt(0);

        for(int i=1;i<=num;i++){
            System.out.print(letter);
        }
    }    
}
