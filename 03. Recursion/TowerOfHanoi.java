// Tower of Hanoi
/* Rules
1. Only one disk can be transferred in one step.
2. Smaller disks are always kept on the top of large disks. 

Algorithm
1. Move n-1 disk from source to helper using destination.
2. Move the remaining 1 disk from source to destination.
3. Move the n-1 disk from helper to destination using source. 
*/

class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + "dest ");
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + "dest ");
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");

    }
}
