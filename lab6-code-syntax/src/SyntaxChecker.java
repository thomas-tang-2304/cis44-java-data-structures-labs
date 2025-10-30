
// You will need a functioning Stack implementation (like ArrayStack) for this to work.
// interface Stack { ... }
// class ArrayStack implements Stack { ... }


import java.util.Stack;

public class SyntaxChecker {

    public static boolean isBalanced(String line) {
        Stack buffer = new ArrayStack<>(line.length());
        ArrayStack arrayStack = (ArrayStack) buffer;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '{'|| line.charAt(i) == '[' || line.charAt(i) == '(') {
                buffer.addFirst(line.charAt(i));
                
            } 
            else if (line.charAt(i) == '}'|| line.charAt(i) == ']' || line.charAt(i) == ')') {
                if (!buffer.isEmpty()){
                   
                    buffer.removeLast();
                         
                } else {
                    return false;
                }
            }
        }
        

        return (buffer.isEmpty());
    }

    public static void main(String[] args) {
        String line1 = "public static void main(String[] args) { ... }"; // Should be true
        String line2 = "int x = (5 + [a * 2]);"; // Should be true
        String line3 = "System.out.println('Hello');)"; // Should be false (extra closing parenthesis)
        String line4 = "List list = new ArrayList<{String>();"; // Should be false (mismatched)
        String line5 = "if (x > 0) {"; // Should be false (unmatched opening brace)

        System.out.println("Line 1 is balanced: " + isBalanced(line1));
        System.out.println("Line 2 is balanced: " + isBalanced(line2));
        System.out.println("Line 3 is balanced: " + isBalanced(line3));
        System.out.println("Line 4 is balanced: " + isBalanced(line4));
        System.out.println("Line 5 is balanced: " + isBalanced(line5));

    }
}
