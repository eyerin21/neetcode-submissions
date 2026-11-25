class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>();
        int left = 0, right = 0, n = nums.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(right < n){
            pq.add(nums[right]);
            if(pq.size() > k){
                pq.remove(nums[left]);
                left++;
            }
            right++;
            if(pq.size() == k)
                ls.add(pq.peek());
        }
        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size(); i++)
            ans[i] = ls.get(i);
        return ans;
    }
}
