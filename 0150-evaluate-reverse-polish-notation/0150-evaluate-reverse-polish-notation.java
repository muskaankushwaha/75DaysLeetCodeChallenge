class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String ch=tokens[i];
            if (ch.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (ch.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (ch.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (ch.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            }else {
                // number case
                stack.push(Integer.parseInt(ch));
            }

        } 
        return stack.pop();
    }
}