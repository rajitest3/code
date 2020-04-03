// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 20, 70, 8};
        int k = 97;
        smallestSubArray(arr, k);
    }
    
    public static void smallestSubArray(int[] arr, int k){
        int sum = 0;
        int left = 0;
        int right = 0;
        
        int smallestSum = Integer.MAX_VALUE;
        
        while (right < arr.length){
            sum = sum + arr[right];
            
            while (left < right && sum > k){
                smallestSum = Math.min(smallestSum, sum);
                sum = sum - arr[left++];
            }
            
            
            
            right++;
        }
        
        System.out.println("min Length = " + (right - left + 1));
        System.out.println("sub array = ");
        for (int i=left-1; i< right; i++)
            System.out.print(arr[i] + " ");
    }
}
