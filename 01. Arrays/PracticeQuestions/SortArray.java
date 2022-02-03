// Sort an array of 0s, 1s and 2s  without using sorting algorithms
// Time Complexity: O(n)

class SortArray {
    public static void sort(int arr[]) {
        int i = 0, c0 = 0, c1 = 0, c2 = 0;
        for (int e : arr) {
            switch (e) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        while (c0 > 0) {
            arr[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            arr[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            arr[i++] = 2;
            c2--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 2, 1, 0, 2, 2, 1, 0 };
        sort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
