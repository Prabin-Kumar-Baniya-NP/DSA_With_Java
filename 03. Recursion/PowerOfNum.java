// Write a recursive function to find the power of num

public class PowerOfNum {
    // Method 1 => Stack Height is n
    public static int power(int num, int p, int pow) {
        if (p == 0) {
            return pow;
        }
        return power(num, p - 1, pow * num);
    }

    // Method 2 => Stack Height is n
    public static int powerNum(int num, int p) {
        if (p == 1) {
            return num;
        }
        int pow = num * powerNum(num, p - 1);
        return pow;
    }

    // Method 3 => Stack Height is log(n)
    /*
     * If p is even => power = x^(p/2)*x^(p/2)
     * If p is odd => power = x^(p/2)*x^(p/2)*x
     */
    public static int powerOfNum(int num, int p) {
        if (p == 0) {
            return 1;
        }
        if (p % 2 == 0) {
            return powerOfNum(num, p / 2) * powerOfNum(num, p / 2);
        } else {
            return powerOfNum(num, p / 2) * powerOfNum(num, p / 2) * num;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3, 1));
        System.out.println(powerNum(5, 3));
        System.out.println(powerOfNum(5, 3));
    }
}
