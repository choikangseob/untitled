package Algorithm.february;

import java.util.Stack;

public class P20250211 {

  public static void main(String[] args) {
    String expression = "3+5*2/(7-2)";
    String postfix = infixToPostfix(expression);
    System.out.println(postfix);
    System.out.println("Clear");
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
      Stack<Character> stack = new Stack<>();// push 저장 ,, pop 빼기 ,,  peek엿보다
      StringBuilder result = new StringBuilder();//문자열 변수를 계속 안만들고 쌓게 해주는 개념

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
          // )이 들어왔을때 ( 이 아니라면 계속 빼내고 그뒤에 ( 을 빼낸다
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

