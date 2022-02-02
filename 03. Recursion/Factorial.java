// Write a recursive function to find the factorial of a number

public class Factorial {
    // Solution 1
    public static int factorialHandler(int num, int fact) {
        if (num == 0) {
            return fact;
        }
        return factorialHandler(num - 1, fact * num);
    }

    public static int factorial(int num) {
        return factorialHandler(num, 1);
    }

    // Solution 2
    public static int factorialCal(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        int prevNum = factorial(num - 1);
        int fact = num * prevNum;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialCal(5));
    }
}
