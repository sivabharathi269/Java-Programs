class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int fixedindex=0;
       List <List<Integer>> res=new ArrayList<>();
        permutation(nums,fixedindex,res);
        return res;
        
    }
    public void  permutation(int[]nums,int fixed,List<List<Integer>> res){
        if(fixed==nums.length-1){
          res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

            return;
        }
        for(int i=fixed;i<nums.length;i++){
            swap(nums,fixed,i);
            permutation(nums,fixed+1,res);
            swap(nums,fixed,i);
        }
    }
        public int[] swap(int[] nums,int fixed,int i){
            int temp=nums[fixed];
            nums[fixed]=nums[i];
            nums[i]=temp;
            return nums;
            
        }
    }
