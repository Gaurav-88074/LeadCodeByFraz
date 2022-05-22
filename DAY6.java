import java.util.Arrays;

public class DAY6 {
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverse(int[] arr,int i){
        if (i > arr.length-i-1) {
            return;
        }
        swap(arr,i,arr.length-i-1);
        reverse(arr, i+1);
    }
    public static void main(String[] args) {
        DAY6 code = new DAY6();

        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));
        code.reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
