package day1;

public class Stay_Positive {
    public static int minStart(int[] arr){
        int x = 1;
        int sum = x;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if (sum < 1){
                x = x + 1 - sum;
                sum = 1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int [] arr1 = {-4,3,2,1};
        System.out.println(minStart(arr1));
    }
}