public class linear {
    public static void main(String []args){
        int arr[] = {2,3,1,6,4,9};
        int key = 9;
        for(int i =0;i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("key found at index"+ i);
            }
        }

    }
}
