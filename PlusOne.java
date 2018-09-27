// https://leetcode.com/submissions/detail/178757432/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 1;
        for(int i=len-1;i>=0&&carry>0;i--){
            digits[i]+=1;
            if(digits[i]<=9) carry=0; 
            else digits[i] -= 10;
        }
        if(carry == 1){
            int[] result = new int[len+1];
            result[0] = 1;
            for(int i=1;i<=len;i++){
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }
}
