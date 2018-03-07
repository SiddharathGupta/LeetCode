class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, add = 1, c = 0;
        //digits[n-1]++;
        for(int i=n-1;i>=0;i--) {
            digits[i] += add;
            c = digits[i]/10;
            if(c > 0) {
                digits[i] = digits[i] % 10;
                add = c;
            }
            else add = 0;
            // add = (c>0)?c:0;
        }
        if(c > 0) {
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}