package Homework4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        double result;

        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop(); // Удаляем последний результат
                result = resultsStack.peek(); // Получаем предпоследний результат
            } else if (resultsStack.size() == 1) {
                result = resultsStack.peek();
            } else {
                result = 0;
            }
        } else {
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = (double) a / b;
                    } else {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемая операция");
            }
            resultsStack.push(result);
        }

        return result;
    }

}
