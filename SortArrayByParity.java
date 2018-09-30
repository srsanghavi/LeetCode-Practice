// https://leetcode.com/problems/sort-array-by-parity/description/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int temp;
        int last = A.length - 1;
        
        for(int i=0;i<A.length;i++){
            if(A[i]%2==1 && last>i){
                temp = A[i];
                A[i]= A[last];
                A[last] = temp;
                last--;
                i--;
            }
        }
        return A;
    }
}
