// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2, 1, 5, -3};
        maxSum(arr);
    }
    
	
	public static void maxSum(int[] arr){
        
        int curSum = arr[0];
        int maxSum = arr[0];
        int curLength = 0;
        int endIndex = 0;
        
        for (int i=1; i<arr.length; i++){
            
            if (curSum + arr[i] > arr[i]){
                curLength++;
                curSum = curSum + arr[i];
            }else{
                curLength = 0;
                curSum = arr[i];
            }
            
            //System.out.println(curLength);
            
            if (curSum > maxSum){
                maxSum = curSum;
                endIndex = i;
            }
            
        }
        
        System.out.println(maxSum);
        
        int[] subarray = Arrays.copyOfRange(arr, endIndex-curLength+1, endIndex+1);
        
        for (int num : subarray)
            System.out.println(num);
    }
}
