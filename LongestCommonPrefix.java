// https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int len=strs[0].length();
        String shortest=strs[0],res="";
        Boolean flag=true;
        for(String s:strs){
            if(len>s.length()){
                len = s.length();
                shortest = s;
            }
        }
        int minLen = len;
        for(int i=0;i<minLen;i++){
            for(String s:strs){
                if(s.charAt(i)!=shortest.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                    break;
                }else{
                    res = res+shortest.charAt(i);
                }
        }
        
        return res;
    }
}