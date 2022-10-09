public class findPivot {
    public static void main(String []args){
        int arr[] = {1,2,4,3,0};
        int s = 0;
        int e= arr.length-1;
        int mid = s + (e - s)/2;
        while(s<e){
            if(arr[mid] >= arr[mid+1]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e - s)/2;
        }
        System.out.println(arr[s]+" is pivot element");
    }
}