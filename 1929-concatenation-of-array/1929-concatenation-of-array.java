class Solution {
    public int[] getConcatenation(int[] nums) {
        int i = 0;
        int[] n = new int [nums.length*2];
        
        for(int j = 0; j < 2; j++){
            for(int x = 0; x < n.length; x++){
                if(x == nums.length){
                    break;
                }
                
                n[i] = nums[x];
                i++;
            }
        }
        
         return n;
    }
   
}