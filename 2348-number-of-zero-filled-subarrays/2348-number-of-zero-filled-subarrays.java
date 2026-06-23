class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long a=0;
        for(int n:nums){
            if(n==0){
                c++;
                a+=c;
            }
            else{
                c=0;
            }
        }
        return a;
    }
}