class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i = 0;
        int count = 0;
        int[] result = new int[2];
        while(count<numbers.length){
            if(numbers[i] + numbers[j] == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        count++;
        return result;
    }
}
