public class binarySearch {
    public static int binarysearch(int arr[] ,int size,int key){
        int start = 0;
        int end = size-1;
        int mid = start + (end-start)/2;
        while(start <= end){
            if(arr[mid]==key){
                return mid;
            }
            if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid= start + (end-start)/2;   
    }
    return -1;
}
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int index = binarysearch(arr,5,5);
        System.out.println("element found at index "+index);
    }
}
//time complexity is O(logn)
