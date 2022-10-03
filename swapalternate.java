import java.util.*;
public class swapalternate {
    public static void printArray(int arr[],int size){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swapAlternate(int arr[],int size){
        for(int i = 0; i<arr.length;i+=2){
            if(i+1<size){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        swapAlternate(arr,5);
        printArray(arr,5);
    }
}
