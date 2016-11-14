import java.util.Stack;


public class BVjin {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
        	if( c == '(' || c == '{' || c == '[' ){
        		stack.push(c);
        	}else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
        		stack.pop();
        	}else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
        		stack.pop();
        	}else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
        		stack.pop();
        	}else{
        		return false;
        	}
        }
        
        return stack.isEmpty();
    }
}
