public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 15, 16};
        System.out.println(maxRange(arr, 2, 5));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start ; i < end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}