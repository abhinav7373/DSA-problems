public class minusingMt {
    public static void main(String []args){
        int arr[] = {2,3,4,1,5};
        int mini = arr[0];
        for(int i = 0;i<arr.length;i++){
            mini = Math.min(mini,arr[i]);
        }
        System.out.println(mini);
    }
}
