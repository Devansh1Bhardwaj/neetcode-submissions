class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        if(strs.length == 0){
            return ans;
        }
        for(int i = 0; i<strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length()){
                    return ans;
                }
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    return ans;
                }
            }
            ans += strs[0].charAt(i);
        }
        return ans;
    }
}