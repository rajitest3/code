class Main {
    public static void main(String[] args) {
        String str = "baaaaa";
        System.out.println(minMoves(str));
    }
    
    public static int minMoves(String str){
        int count = 0;
        int as = 0;
        int bs = 0;
        
        for (char c : str.toCharArray()){
            if (c == 'a'){
                as++;
                bs = 0;
            }else{
                as = 0;
                bs++;
            }
            
            if (as == 3 || bs == 3){
                count++;
                as = 0;
                bs = 0;
            }
        }
        
        return count;
    }
}
