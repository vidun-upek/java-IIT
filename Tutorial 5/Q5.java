import java.util.Scanner;

class Q5{
    public static int recursiveNum(int a,int b){
        if(b==0){
            return 1;
        }else if(b>0){
            return a * recursiveNum(a,b-1);
        }else{
            System.out.println("Error");
            return -1;
        }
        
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userNum = scanner.nextInt();
        System.out.println("Enter power: ");
        int userPower = scanner.nextInt();

        int result = recursiveNum(userNum, userPower);
        if (result != -1) {  // Check if there was an error
            System.out.println("Answer: " + result);
        }
    }
}