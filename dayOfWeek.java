/*
Time complexity: O(1)
Space complexity: O(1)
*/

import java.util.*;
    
class Main {
    public static void main(String[] args) {
        String str = "Sat";
        int K = 23;
        System.out.println(dayOfTheWeek(str, K));
    }
  
    public static String dayOfTheWeek(String str, int K){
        
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i=0; i<week.length; i++){
            map.put(week[i], i);
        }
            
        return week[(map.get(str) + K) % 7];
    }
}
