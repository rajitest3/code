// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 1, 5, 6, 4, 10, 9, 8, 0 };
        maxDistance(arr);
    }
    
    public static void maxDistance(int[] arr){
        int[] LMin = new int[arr.length];
        int[] RMax = new int[arr.length];
        
        LMin[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            LMin[i] = Math.min(arr[i], LMin[i-1]);
        }
        
        RMax[arr.length-1] = arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--){
            RMax[i] = Math.max(arr[i], RMax[i+1]);
        }
        
        int i=0;
        int j=0;
        int maxDistance = Integer.MIN_VALUE;
        
        while (i<arr.length && j<arr.length){
            if (LMin[i] <= RMax[j]){
                maxDistance = Math.max(maxDistance, j-i);
                j++;
            }else{
                i++;
            }
        }
        
        System.out.println(maxDistance);
    }
}
