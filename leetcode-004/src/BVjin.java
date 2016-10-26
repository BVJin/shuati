import java.util.Arrays;

public class BVjin {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	//Write by BV LOL
    	//Time complexity should be O(log(m+n))
    	//http://www.programcreek.com/2012/12/leetcode-median-of-two-sorted-arrays-java/
    	//http://www.jiuzhang.com/solutions/median-of-two-sorted-arrays/
    	
        int i = 0, j = 0, n=nums1.length, m=nums2.length;
        int[] res = new int[n+m];
        for(int index = 0; index<n+m; index++){
        	
        	if(j==m){
        		res[index] = nums1[i++];
        		continue;
        	}
        	
        	if(i==n){ 
        		res[index] = nums2[j++];
        		continue;
        	}
        	
        	if(nums1[i]<=nums2[j]){
        		res[index] = nums1[i++];
        		continue;
        	}
        	if(nums1[i]>nums2[j]){
        		res[index] = nums2[j++];
        		continue;
        	}
        }
        
        return (n+m)%2==0?(res[(n+m)/2]+res[(n+m)/2-1])*1.0/2 : res[(n+m)/2]*1.0;
    }
}
