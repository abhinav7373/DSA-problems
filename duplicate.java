public class duplicate {
    public static void main(String []args){
        int arr[] = {1,2,3,2,4};
        int ans = 0;
        //xoring all element
        for(int i = 0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        //xoring element [1 to n-1]
        for(int i =1;i<arr.length;i++){
            ans = ans^i;
        }
        System.out.println(ans+" is repeated element");
    }
}
