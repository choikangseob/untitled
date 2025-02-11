package Algorithm.february;

import java.util.Stack;

public class P20250211 {

  public static void main(String[] args) {
    String expression = "3+5*2/(7-2)";
    String postfix = infixToPostfix(expression);
    System.out.println(postfix);
  }

    private static int precedence(char operator) {
      if (operator == '+' || operator == '-') {
        return 1;
      } else if (operator == '*' || operator == '/') {
        return 2;
      }
      return -1;
    }


    public static String infixToPostfix(String expression){
      Stack<Character> stack = new Stack<>();
      StringBuilder result = new StringBuilder();

      for(int i = 0; i < expression.length(); i++){
        char ch = expression.charAt(i);

        if(ch == ' '){
          continue;
        }

        if(Character.isDigit(ch)){
          result.append(ch);
        }

        else if(ch =='('){
          stack.push(ch);
        }else if(ch == ')'){
          while(!stack.isEmpty() && stack.peek() != '('){
            result.append(stack.pop());
          }
          stack.pop();
        }
        else{
          while(!stack.isEmpty() && precedence(stack.peek())>=precedence(ch)){
            result.append(stack.pop());
          }
          stack.push(ch);
        }
      }

      while(!stack.isEmpty()){
        result.append(stack.pop());
      }
      return result.toString();
    }
  }

