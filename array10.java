//move all negative element to the one side of array
public class array10 {
    public static void main(String []args){
        int arr[] = {3,-2,5,-4,-1};
        int pivot = 0;
        int i = -1;
        for(int j=0;j<5;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    
    for(int k= 0;k<5;k++){
        System.out.print(arr[k] + " ");
    }
    }
}
