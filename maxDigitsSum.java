/*
input = {51, 71, 17, 42}
output = 93
*/
  
  public static int numEqualDigitSum(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;    // default to -1;
        for (int a : A) {
            int sum = getSum(a);
            if (map.containsKey(sum)) {
                res = Math.max(map.get(sum) + a, res);
                map.put(sum, Math.max(a, map.get(sum)));
            } else {
                map.put(sum, a);
            }
        }
        return res;
    }

    private static int getSum(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
