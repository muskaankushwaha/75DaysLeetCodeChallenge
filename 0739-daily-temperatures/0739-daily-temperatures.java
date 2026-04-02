class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int [] ans=new int[n];

        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(i);

            }
                while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                ans[stack.peek()]=i-stack.peek();
                stack.pop();
             
            }
            stack.push(i);
        
        }
        return ans;
    }
}