// Write a recursive function to find the fibonacci series upto N terms
/* Fibonacci upto 8th term
0 1 1 2 3 5 8 13
*/
public class Fibonacci {
    public static void printfibonacci(int term, int firstTerm, int secondTerm){
        if (term == 0){
            return;
        }
        System.out.println(firstTerm);
        printfibonacci(term-1, secondTerm, firstTerm+secondTerm);
    }
    public static void main(String[] args) {
        printfibonacci(8, 0, 1);
    }
}
/* 
Term 1 => ft=13, st=21
Term 2 => ft=8, st=13
Term 3 => ft=5, st=8
Term 4 => ft=3, st=5
Term 5 => ft=2, st=3
Term 6 => ft=1, st=2
Term 7 => ft=1, st=1
Term 8 => ft=0, st=1
*/