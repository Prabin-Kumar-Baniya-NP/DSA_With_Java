// Find the number of ways in which you can invite n people to your party, single or pairs
/*
Explanation
n=1 => 1
n=2 => [(1), (2)], [(1,2)] => 2
n=3 => [(1), (2), (3)], [(1,2), (1,3)], [(2,3)], [(1), [2,3]] => 4

i.e. single, pair, mix
*/

public class FriendsPairing {
    public static int pairFriends(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int single = pairFriends(n - 1);

        // pair
        int pair = (n - 1) * pairFriends(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(4));
    }
}
