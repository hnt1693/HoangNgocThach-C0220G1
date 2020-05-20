package model;

public class Calculator {
    public double cal(String cal, double num1, double num2) {
        double resuilt = 0;
        switch (cal) {
            case "+": {
                resuilt = num1 + num2;
                break;
            }
            case "-": {
                resuilt = num1 - num2;
                break;
            }
            case "*": {
                resuilt = num1 * num2;
                break;
            }
            default: {
                if (num2 == 0) {
                    resuilt = 0;
                } else {
                    resuilt = num1 / num2;
                }
                break;
            }

        }
        return resuilt;

    }
}
