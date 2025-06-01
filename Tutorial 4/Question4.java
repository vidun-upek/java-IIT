import java.util.Arrays;

public class Question4{
    public static void main(String[] args){
        int[] A= {2, 3, 4, 5, 6, 7, 8, 9};

        //Part A
        int i=0;
        System.out.println("Even numbers are: ");
        while(i < A.length){
            if(A[i] % 2 ==0){
                System.out.println(A[i]);
            }
            i++;
        }

        //part B
        System.out.print("Part B:");
        int j=0;
        while(j<A.length){
            int multiplied = A[j]*2;
            if(Arrays.stream(A).anyMatch(x->x==multiplied)){
                System.out.println(A[j]);
            }
            j++;
        }




    }
}