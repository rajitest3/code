// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

class Main {
    public static void main(String[] args) {
        int[] nums = {4,4,6,1,2,2,2,3};
        System.out.println(goodTuples(nums));
    }
    
    static int goodTuples(int[] nums){
        int count = 0;
        for (int i = 1; i < nums.length -1; i++) {
            if (
                (nums[i-1] == nums[i] && nums[i] != nums[i+1])
                || (nums[i-1] != nums[i] && nums[i] == nums[i+1])
                   || (nums[i-1] == nums[i+1] && nums[i] != nums[i+1])
            ) 
            {
                count++;
            }
        }
        return count;
    }
}
