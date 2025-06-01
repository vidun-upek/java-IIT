import java.util.Scanner;
public class Question9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] array= new double[10];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter marks of student "+(i+1));
            double mark=scanner.nextDouble();
            array[i]=mark;
        }
        System.out.println();
        
        for(int j=0;j<array.length;j++){
            double reduce=array[j]*(10.0/100);
            array[j]=array[j]-reduce;
            System.out.println(array[j]);
        }
    }
}