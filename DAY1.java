
public class DAY1 {
    int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        DAY1 code = new DAY1();
        System.out.print("The value of fact(6) is : ");
        int res = code.factorial(6);
        System.out.println(res);
    }
}
