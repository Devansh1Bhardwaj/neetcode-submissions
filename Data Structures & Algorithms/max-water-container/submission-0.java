class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max = 0;
        while(i < j){
            int len = Math.min(heights[i], heights[j]);
            int wid = j-i;
            int ar = len * wid;
            max = Math.max(ar, max);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
