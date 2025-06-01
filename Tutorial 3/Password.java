import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int password=486251;

        for(int i=1;i<=4;i++){
            System.out.println("Enter password: ");
            int user=scanner.nextInt();
            if (user==password){
                System.out.println("Entered password is correct.");
                break;
            }
            else{
                System.out.println("Try again");
            }
        }
    }
    
}
