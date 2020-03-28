import java.util.*;
    
class Main {
    public static void main(String[] args) {
        String str = "Codility We test code";
        int K = 14;
        System.out.println(cropWords(str, K));
    }
   
    public static String cropWords(String s, int k){
        if(k >= s.length() || k == 0){
            return s;
        }
        while(s.charAt(k) != ' '){
            k--;
        }
        while(k > 0 && s.charAt(k) == ' '){
            k--;
        }
        return s.substring(0, k + 1);
    }
}
