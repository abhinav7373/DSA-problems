public class uniqueArr {
    public static void main(String []args){
        int arr[] = {1,4,2,1,2};
        int ans = 0;
        int i = 0;
        for(i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        System.out.println(ans+" is unique no");
}
}