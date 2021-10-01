package edu.java8.poc.lamda;

public class LamdaExpression {

    public static void main(String[] args) {

        LamdaExpression exp = new LamdaExpression();
        MathOperation addition = (int a, int b) ->  a + b;
        MathOperation subtract = (int a, int b) -> a - b;
        MathOperation multiply = (int a, int b) -> a * b;
        MathOperation divide = (int a, int b) -> a / b;
        MathOperation remainder = (int a, int b) -> a % b;

        System.out.println( "addition : " + exp.operate(5, 6, addition));
        System.out.println( "subtract : " + exp.operate(5, 6, subtract));
        System.out.println( "multiply : " + exp.operate(5, 6, multiply));
        System.out.println( "divide : " + exp.operate(50, 6, divide));
        System.out.println( "remainder : " + exp.operate(45, 6, remainder));
    }


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
