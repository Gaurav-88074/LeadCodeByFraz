public class DAY5 {
    boolean isPalindrome(String s,int i){
        if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        if (i>=(s.length()-i-1)) {
            return true;
        }
        return isPalindrome(s,i+1);
    }
    public static void main(String[] args) {
        DAY5 code = new DAY5();

        System.out.print("is Gaurav palindrome : ");
        boolean res = code.isPalindrome("Gaurav",0);
        System.out.println(res);
    }
}
