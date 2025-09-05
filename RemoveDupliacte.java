class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];//start k=1 bcz nums[0] is unique element bcz the array is sorted
                k++;
            }
        }
      return k;  
    }
}
