class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for( int  i = 0 ; i < tokens.length ; i++ ){
            String token = tokens[i];
            char ch = tokens[i].charAt(0) ;

            if( token.length()==1 && "+-*/".indexOf(ch) != -1){
                int n2 = stack.pop();
                int n1 = stack.pop();
                switch(ch){
                    case '+' -> stack.push(n1 + n2);
                    case '-' -> stack.push(n1 - n2);
                    case '*' -> stack.push(n1 * n2);
                    case '/' -> stack.push(n1 / n2);
                    default -> System.out.print("Invalid Operator");
                }
            }else{
                stack.push(Integer.parseInt(token) );
            }

        } 
        return stack.pop();
    }
}
