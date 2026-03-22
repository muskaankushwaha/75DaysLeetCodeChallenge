class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        int n = nums.length;
int[] ps = new int[n];

ps[0] = nums[0];
for(int i = 1; i < n; i++){
    ps[i] = ps[i-1] + nums[i];
}

int count = 0;
HashMap<Integer, Integer> map = new HashMap<>();
map.put(0,1);

for(int i = 0; i < n; i++){
    if(map.containsKey(ps[i] - k)){
        count += map.get(ps[i] - k);
    }
    map.put(ps[i], map.getOrDefault(ps[i], 0) + 1);
}return count;
    }
}