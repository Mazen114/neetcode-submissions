class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] result = new int[nums.length];
        int total = 1;
        for(int i=0;i<nums.length;i++){
            total*=nums[i];
            prefix[i] = total;
        }
        total = 1;
        for(int j=nums.length-1;j>0;j--){
            total*=nums[j];
            postfix[j] = total;
        }
        for(int k=0;k<nums.length;k++){
            if(k==0){
                result[k] = postfix[k+1];
            }
            else if(k==nums.length-1){
                result[k] = prefix[k-1];
            }
            else{
                result[k] = prefix[k-1]*postfix[k+1];
            }
        }
        return result;
    }
}  
