
public class BVjin {
    public void wiggleSort(int[] nums) {
    	
    	 int i = 0;
    	 while(i < nums.length){
    		 if(i%2 == 1){
          		if(nums[i-1]>nums[i]){
          			int temp = nums[i];
          			nums[i-1] = nums[i];
          			nums[i] = temp;
          		}
          	}else if(i != 0 && nums[i-1] < nums[i]){
          		int temp = nums[i];
      			nums[i-1] = nums[i];
      			nums[i] = temp;			
          	}else if(i != 0 && nums[i-1] == nums[i]){
          		int j = i+1;
          		while(j<nums.length){
          			System.out.println(j);
          			if(nums[j] != nums[i]){
          				System.out.println(j);
          				int temp = nums[j];
	          			nums[j] = nums[i];
	          			nums[i] = temp;
	          			break;
          			}
          			j++; 			
          		}
          		continue;
          	}
    		i++;
    	 }
    	 
    }
}
