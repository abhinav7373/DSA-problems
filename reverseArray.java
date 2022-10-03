public class reverseArray {
    public static void main(String []args){
        int arr[] = {6,5,4,3,2,1};
        int st = 0 , end =5;
        while(st<=end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}