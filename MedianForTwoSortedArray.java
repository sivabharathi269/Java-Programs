class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merge = new int[m + n];
    
        for(int i=0;i<m;i++){
            merge[i]=nums1[i];
          }
        for(int j=0;j<n;j++){
            merge[m+j]=nums2[j];
        }
         Arrays.sort(merge);
         int start=0;
        int end=merge.length-1;
        double median=0.0;
        if(merge.length%2==0){
           
        int  mid=(start+(end-start))/2;
          median=(double)(merge[mid]+merge[mid+1])/2;
        }
        else{
            median=merge[(start+(end-start))/2];
         
        }
       
       System.out.println( Arrays.toString(merge));
  
        return median;
    }
}
