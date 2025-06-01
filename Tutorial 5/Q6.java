class Q6{
    public static void main(String[] args){
        System.out.println(t(4));
    }

    public static int t(int n){
        if (n == 0) {
            return 1;  // Base case: t(0) = 1
        } else if (n == 1) {
            return 3;  // Base case: t(1) = 3
        } else {
            // Recursive step: t(n) = t(n-2) + t(n-1)
            return t(n - 2) + t(n - 1);
        }

    }
}