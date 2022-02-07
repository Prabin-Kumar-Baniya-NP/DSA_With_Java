// Count Total Path in a Maze to move from (0,0) to (n,m) 
// Rule: Can move only in right or downward direction
// Explanation: Can move right(i+1, j) or downwards(i, j+1) till (i=n-1, j=n-1)

class CountPathMaze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3, 3)); // 6
    }

}
