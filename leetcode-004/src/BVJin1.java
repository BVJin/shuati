
public class BVJin1 {
	// time complexity = log(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
    	if(l%2!=0){
    		return findkth(l/2+1, nums1, nums2, 0, 0)*1.0;
    	}else{
    		return (findkth(l/2+1, nums1, nums2, 0, 0) + findkth(l/2, nums1, nums2, 0, 0)) * 0.5;
    	}
    }
    
    public int findkth(int k, int[] nums1, int[] nums2, int s1, int s2){
    	if(s1>=nums1.length){
    		return nums2[s2+k-1];
    	}
    	
    	if(s2>=nums2.length){
    		return nums1[s1+k-1];
    	}
    	
    	if(k == 1){
    		return Math.min(nums1[s1], nums2[s2]);
    	}
    	
    	int m1 = s1+k/2-1;
    	int m2 = s2+k/2-1;
    	
    	int mid1 = m1 < nums1.length?nums1[m1]:Integer.MAX_VALUE;
    	int mid2 = m2 < nums2.length?nums2[m2]:Integer.MAX_VALUE;
    	
    	return mid1<mid2?findkth(k-k/2, nums1, nums2, s1+k/2, s2):findkth(k-k/2, nums1, nums2, s1, s2+k/2);
    }
}
