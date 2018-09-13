public class Calculator {

    private int sum(int num1, int num2) {
        return  num1 + num2;
    }

    private int sub(int num1, int num2) {
        return num1 - num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private int divide(int num1, int num2) {
        return num1 / num2;
    }

    private int calculate(String op, int result, int num) {
        if(op.equals("+")) return result = sum(result, num);
        else if(op.equals("-")) return result = sub(result, num);
        else if(op.equals("*")) return result = multiply(result, num);
        else return result = divide(result, num);
    }

    private boolean checkOperand(String str) {
        try {
            int n = Integer.parseInt(str);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public int calculateResult(String[] input) {
        String operand = null;
        int result = Integer.parseInt(input[0]);
        for (int i = 1; i < input.length; i++) {
            if(checkOperand(input[i])) operand = input[i];
            else result = calculate(operand, result, Integer.parseInt(input[i]));
        }

        return result;
    }
}
