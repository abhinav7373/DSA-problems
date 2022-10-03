import java.util.Arrays;
public class array {
    public static void main(String []args){
        int arr[]=new int[10];
        Arrays.fill(arr,5);
        for(int i =0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}