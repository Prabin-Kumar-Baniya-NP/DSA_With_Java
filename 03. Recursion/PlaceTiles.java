// Place Tiles of size 1 x m in floor of size n x m
/*
Hints: Different ways may include 
1. Place tiles horizontally
2. Place tiles vertically
3. Place tiles horizontally then vertically
4. Place tiles vertically then horizontally
5. Place tiles horizonally then vertically then horizontally
depending upon the value of n, m
*/
class PlaceTiles {
    public static int placeTiles(int n, int m) {
        // base case
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically placements
        int verticalPlacements = placeTiles(n - m, m);

        // horizontally
        int horizontalPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;

    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}
