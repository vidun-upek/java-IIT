import java.util.Random;

public class Question8{
    public static void main(String[] args){

        Random random=new Random();
        int total=0;
        
        int count3=0;
        int count1=0;
        int count2=0;
        while(total<1000){
            int randomNum1=random.nextInt(6)+1;
            int firstRoll=randomNum1;
            int randomNum2=random.nextInt(6)+1;
            int secondRoll=randomNum2;

            if (firstRoll==4){
                count1+=1;
            }
            if (secondRoll==4){
                count2+=1;
            }
            if(firstRoll==secondRoll){
                count3+=1;
            }
            total++;
        }
        System.out.println("probability of x=4 after 1000 simulations: "+ (double)count1/1000);
        System.out.println("probability of Y=4 after 1000 simulations: "+ (double)count2/1000);
        System.out.println("probability of x=4 and Y=4 after 1000 simulations: "+ (double)count3/1000);
    }
}