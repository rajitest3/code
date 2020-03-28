/*
Largest number X which occurs X times

e.g {3, 8, 2, 3, 3, 2} ans 3
*/

import java.util.*;
    
class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5};
        
        System.out.println(largestNumber(arr));
    }
   
    public static int largestNumber(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        int max = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getKey() == entry.getValue()){
                if (entry.getValue() > max)
                    max = entry.getValue();
            }
        }
        
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }
}
