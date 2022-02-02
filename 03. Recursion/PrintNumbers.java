class PrintNumbers {
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num); // Prints 5 4 3 2 1
        printNum(num - 1);
        System.out.println(num); // Prints 1 2 3 4 5
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
