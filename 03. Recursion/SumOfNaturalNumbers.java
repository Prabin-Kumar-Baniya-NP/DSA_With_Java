// Write a recursive function to calculate the sum of first N natural numbers

class SumOfNaturalNumbers {
    // Solution 1
    public static int sum(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return sum(num - 1, sum + num);
    }

    // Solution 2
    public static int naturalSum(int num) {
        if (num == 0) {
            return num;
        }
        int prevNum = naturalSum(num - 1);
        int sum = num + prevNum;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 0));
        System.out.println(naturalSum(5));
    }
}
