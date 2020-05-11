class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         double median;
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=n1+n2;
        int[] arr=new int[n3];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            al.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++)
        {
            al.add(nums2[i]);
        }
        
        Collections.sort(al);
        
       for(int i=0;i<al.size();i++)
       {
           arr[i]=al.get(i);
       }
        
        if(n3%2!=0)
        {
            median=arr[n3/2];
        }
        else
        {
            int x=arr[n3/2]+arr[n3/2-1];
            median=x;
            median=median/2;
        }
        return median;
        
        
    }
}
