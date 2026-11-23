class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n-1;

        int maxArea = Integer.MIN_VALUE;

        while(left < right){
            int diff = right-left;
            int area = Math.min(heights[left], heights[right]) * diff;
            maxArea = Math.max(maxArea,area);

            if(heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
