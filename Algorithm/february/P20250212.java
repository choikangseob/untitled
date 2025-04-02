package Algorithm.february;

import java.util.Stack;

public class P20250212 {

  // 연산 수행 메소드
  public static int evaluatePostfix(String expression) {
    Stack<Integer> stack = new Stack<>();

    // 공백을 기준으로 나누어서 토큰 처리
    String[] tokens = expression.split(" ");

    // 각 토큰을 처리
    for (String token : tokens) {
      if (isOperator(token)) {
        // 연산자인 경우 스택에서 두 개의 피연산자 꺼내기
        int b = stack.pop();
        int a = stack.pop();

        // 연산자에 따라 계산
        int result = performOperation(a, b, token);

        // 결과를 다시 스택에 넣기
        stack.push(result);
      } else {
        // 피연산자일 경우 스택에 넣기
        stack.push(Integer.parseInt(token));
      }
    }

    // 최종 결과는 스택에 남아있는 유일한 값
    return stack.pop();
  }

  // 연산자 확인 메소드
  private static boolean isOperator(String token) {
    return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
  }

  // 연산 수행 메소드
  private static int performOperation(int a, int b, String operator) {
    switch (operator) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        return a / b;
      default:
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
  }

  public static void main(String[] args) {
    String expression = "3 5 2 + * 9 - ";
    int result = evaluatePostfix(expression);
    System.out.println("Result: " + result);
    System.out.println("Clear");
  }
}
