class PairOfSum {
    /*
     * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
     * Output: true
     * There is a pair (6, 10) with sum 16
     */
    static boolean checkPair(int arr[], int n, int sum) {
        int smallest, greatest;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        greatest = i;
        smallest = (greatest + 1) % n;
        while (smallest != greatest) {
            if (arr[smallest] + arr[greatest] == sum)
                return true;
            if (arr[smallest] + arr[greatest] < sum) {
                smallest = (smallest + 1) % n; // Find another successive smallest
            } else {
                greatest = (n + greatest - 1) % n; // Find another successive greatest
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        System.out.println(checkPair(arr, arr.length, 16));
    }
}