class Q3{
    public static void loop(int a,int b){
        int n = b;
        if (a>b){
            System.out.println("Program Ended");
            return;
        }else{
            System.out.println(a);
            loop(a+1,b);
        }

    }

    public static void main(String[] args){
        loop(1,100);
    }
}