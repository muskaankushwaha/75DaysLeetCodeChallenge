class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack=new Stack<>();
        int n=asteroids.length;
        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }else if(!stack.isEmpty()&&stack.peek()<0){
                stack.push(asteroids[i]);
            }else{while(!stack.isEmpty()&& stack.peek()>0){
                if(asteroids[i]>0){
                     stack.push(asteroids[i]);
                     break;
                }else{
                    int abs= Math.abs(asteroids[i]);
                    if(stack.peek()<abs){
                        stack.pop();
                        if(stack.isEmpty()||stack.peek()<0){
                            stack.push(asteroids[i]);
                        }
                    }else if(stack.peek()==abs){
                        stack.pop();
                        break;
                    }else{
                        break;
                    }
                }
            }
            }
        }
        int [] ans= new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            ans[i]=stack.get(i);
        }
        return ans;
    }
}