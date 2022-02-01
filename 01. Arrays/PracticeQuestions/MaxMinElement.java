// Write a function to return minimum and maximum in an array. 
// Your program should make the minimum number of comparisons. 

public class MaxMinElement {
    public static void minmax(int[] arr){
        int min_index = 0;
        int max_index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[min_index]){
                min_index = i;
            }
            if(arr[i] > arr[max_index]){
                max_index = i;
            }
        }
        System.out.println(arr[max_index]);
        System.out.println(arr[min_index]);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,5,6,7,0};
        minmax(arr);
    }
}
