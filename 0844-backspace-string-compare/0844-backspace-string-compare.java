class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(stack1.isEmpty()&&ch=='#'){
                continue;
            }
            if(!stack1.isEmpty()&& ch=='#'){
                stack1.pop();
            }else{
                stack1.push(ch);
            }
        }
         for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
             if(stack2.isEmpty()&&ch=='#'){
                continue;
            }
            if(!stack2.isEmpty()&& ch=='#'){
                stack2.pop();
            }else{
                stack2.push(ch);
            }
         }
         String s1="";
         String s2="";
         while(!stack1.isEmpty()){
           s1+=stack1.pop();
            }
             while(!stack2.isEmpty()){
           s2+=stack2.pop();
            }
         if(s1.equals(s2)){
         return true;
         }else{
            return false;
         }
    }
}