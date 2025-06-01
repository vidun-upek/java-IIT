public class Question6{
    public static void main(String[] args){
        int [] runs = {05,12, 28, 34, 47, 52, 65, 71, 80, 99};

        int low =0;
        int high =runs.length-1;
        int mid=(low+high)/2;
        int searchValue=47;

        while(low<=high && runs[mid]!=searchValue){
            if(searchValue>runs[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            System.out.print("Value not found");
        }else{
            System.out.println("scored at match:  "+mid);
        }
    }
}