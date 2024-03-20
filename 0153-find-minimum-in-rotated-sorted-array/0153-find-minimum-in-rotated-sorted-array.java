class Solution {
    public int findMin(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        
        
        while (left < right){
            
           int mid = (left + right) / 2;
                
                if(nums[mid] > nums[right] ){
                    left = mid + 1;
                }
            else right = mid;
        }
             return nums[left];  
     
    }
}



//return min element of array
    // its either the pivot
    //or the first element
//find pivot
// or it could be an originally asc array without pivot

//[4,5,6,7,0,1,2]

//  Rule :
// while (L < R) 
// if M > R : L -> M + 1
//    else R = M



