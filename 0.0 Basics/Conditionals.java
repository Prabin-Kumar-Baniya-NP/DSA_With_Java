public class Conditionals {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        char o = '+';
        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        switch (o) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println(num1 * num2);
        }
    }
}
