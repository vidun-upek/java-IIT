/*public class NestedLoops {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}*/

/*public class NestedLoops{
    public static void main(String[] args){
        for(int i=2;i<=8;i+=2){
            for(int j=1;j<=i;j+=2){
                    System.out.print(i);     
            }
            System.out.println();
        }
    }
}*/
/* 
public class NestedLoops{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                    System.out.print(" *");}
            
            System.out.println();
        }
    }
}*/
public class NestedLoops{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
