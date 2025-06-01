import java.util.Scanner;

public class Question5{
    public static void main(String[] args){

        double[][] marks = new double[5][3];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5;i++){
            System.out.println("Enter marks for student "+(i+1)+":");
            for(int j=0;j<3;j++){
                switch(j){
                    case 0:
                        System.out.print("Enter SD2 mark: ");
                        break;
                    case 1:
                        System.out.print("Enter Web mark: ");
                        break;
                    case 2:
                        System.out.print("Enter Maths mark: ");
                        break;
                }
                marks[i][j] = scanner.nextDouble();
            }
        }

        //avg
        for(int i=0;i<5;i++){
            double total =0;
            for(int j=0;j<3;j++){
                total+=marks[i][j];
            }
            double average=total/3;
            System.out.println("Student "+(i+1)+" Average: "+average);
        }
    }
}