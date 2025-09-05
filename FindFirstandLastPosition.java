class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first=FindFirst(nums,target);
      int last=FindLast(nums,target);
      return new int[]{first,last};
    }
      public int FindFirst(int[] arr,int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(arr[mid]==target){
                ans=mid;
                end=mid-1;
                }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
         return ans;
      }
      public int FindLast(int[] arr,int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
             int mid=start+(end-start)/2;
             if(arr[mid]==target){
                ans=mid;
                start=mid+1;
                }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
         return ans;
      }
        
    }
