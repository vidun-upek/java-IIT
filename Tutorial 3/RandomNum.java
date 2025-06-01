import java.util.Random;
import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args){
        Random rnd=new Random();
        Scanner scanner=new Scanner(System.in);

        int random=rnd.nextInt(21);
        
        while (true){

            System.out.println("Enter number: ");
            int user=scanner.nextInt();

            if (user==random){
                System.out.println("you are correct.");
                break;
            }else{
                continue;
        }

        }

    }
    
}
