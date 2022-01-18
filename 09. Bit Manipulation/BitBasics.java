public class BitBasics {
    public static int getBit(int num, int pos) {
        // Step 1 - Bit Mask => 1 << pos
        // Step 2 - Bitwise AND Operation ==> bitMask & num
        // Result - If non-zero -> 1, if zero -> 0
        int bitMask = 1 << pos;
        if ((bitMask & num) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int num, int pos) {
        // Step 1 - Bit Mask ==> 1 << pos
        // Step 2 - Bitwise OR Operation ==> bitMask | num
        int bitMask = 1 << pos;
        return (bitMask | num);
    }

    public static int clearBit(int num, int pos) {
        // Step 1 - Bit Mask ==> 1 << pos
        // Step 2 - Bitwise NOT then Bitwise AND operation ==>
        int bitMask = 1 << pos;
        return (~(bitMask) & num);
    }

    public static int updateBit(int num, int pos, int operation) {
        // If 0 needs to be updated ==> use clearBit
        // If 1 needs to be updated ==> use setBit
        if (operation == 1) {
            return setBit(num, pos);
        } else if (operation == 0) {
            return clearBit(num, pos);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getBit(5, 2));
        System.out.println(setBit(5, 1));
        System.out.println(clearBit(5, 2));
        System.out.println(updateBit(5, 2, 1));
    }
}