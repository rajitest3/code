/*
Given a string S, find the largest alphabetic character, 
whose both uppercase and lowercase appear in S. 
The uppercase character should be returned. For example,
for S = "admeDCAB", return "D". If there is no such character, return "NO".
*/

class Main {
    public static void main(String[] args) {
        String S = "admeDCAB";
        
        System.out.println(largestAlphabetCharacter(S));
    }
    
    public static String largestAlphabetCharacter(String S){
        if (S == null || S.isEmpty())
            return "NO";
        
        boolean[] lowerCaseLetters = new boolean[26];
        boolean[] upperCaseLetters = new boolean[26];
        
        for (int i=0; i<S.length(); i++){
            int ascii = (int) S.charAt(i);
            char ch = S.charAt(i);
             
            if (ascii >= 65 && ascii <= 90){
                upperCaseLetters[ch - 'A'] = true;    
            }else if (ascii >=97 && ascii <=125) {
                lowerCaseLetters[ch - 'a'] = true; 
            }
        }
        
        for (int i=upperCaseLetters.length-1;i>=0;i--){ 
            if (upperCaseLetters[i] == true && lowerCaseLetters[i] == true){
                return Character.toString((char) (i + 'A'));    
            }
        }
        
        return "NO";
    }
}
