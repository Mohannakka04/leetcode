class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[index++] = nums[i%n];
        }
        return arr;
    }
}