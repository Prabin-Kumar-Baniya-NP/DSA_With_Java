# Bit Manipulation Concepts

1. Get Bit

```
Step 1 - Bit Mask => 1 << pos
Step 2 - Bitwise AND Operation ==> bitMask & num
Result - If non-zero -> 1, if zero -> 0
```

2. Set Bit

```
Step 1 - Bit Mask ==> 1 << pos
Step 2 - Bitwise OR Operation ==> bitMask | num
```

3. Clear Bit

```
Step 1 - Bit Mask ==> 1 << pos
Step 2 - Bitwise NOT then Bitwise AND operation ==>
```

4. Update Bit:

```
If 0 needs to be updated ==> use clearBit
If 1 needs to be updated ==> use setBit
```
