package lesson_4.calculator;

class Calculator {
    private String[] mathExpression = new String[3];

    void splitMathOperation(String expression) {
        mathExpression = expression.split(" ");
    }

    int calculate() {
        switch (mathExpression[1]) {
            case "+":
                return Integer.parseInt(mathExpression[0]) + Integer.parseInt(mathExpression[2]);
            case "-":
                return Integer.parseInt(mathExpression[0]) - Integer.parseInt(mathExpression[2]);
            case "/":
                return Integer.parseInt(mathExpression[0]) / Integer.parseInt(mathExpression[2]);
            case "*":
                return Integer.parseInt(mathExpression[0]) * Integer.parseInt(mathExpression[2]);
            case "%":
                return Integer.parseInt(mathExpression[0]) % Integer.parseInt(mathExpression[2]);
            case "^":
                return (int) Math.pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            default:
                System.out.println("Invalid math operation sign");
        }
        return 0;
    }
}