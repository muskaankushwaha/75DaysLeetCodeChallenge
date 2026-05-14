class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0; i<piles.length; i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
    
    while(low<=high){
        long sum=0;
        int mid=low+(high-low)/2;
        for(int i=0; i<piles.length; i++){
            sum+=((piles[i]+mid-1)/mid);
        }
        if(sum<=h)high=mid-1;
        else{
            low=mid+1;
        }
    }
    return low;
    }
}