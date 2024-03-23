class Solution {
    public int maxArea(int[] height) {
        
    int max_area = 0;
    int left = 0;
    int right = height.length - 1;
        
        while (left < right){
            int width = right - left;
            max_area = Math.max(max_area, Math.min(height[left], height[right]) * width);
            if(height[left] < height[right]){
                left ++;
            }
            else right --;   
        }
        return max_area;
    }
}


//approach -------------------------
//two pointers i and j
//    i from 0 to n-1
//    j from n-1 to (until i<j)

//    set integerMAx to math.max(largest area)
    
//    area =  width * height --- width = j - i
//    return largest area

