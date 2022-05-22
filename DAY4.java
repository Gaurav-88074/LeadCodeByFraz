public class DAY4 {
    public int power(int value,int pow){
        if(pow==0){
            return 1;
        }
        int partial = power(value, pow/2);
        if (pow%2==1) {
            return value * partial * partial;
        }
        return partial * partial;
    }
    public static void main(String[] args) {
        DAY4 code = new DAY4();

        System.out.print("The value of 2^5 is : ");
        int res = code.power(2,10);
        System.out.println(res);
    }
}














