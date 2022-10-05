public class FstLstEleOfArr {
    public static int firstPositionOfElement(int arr[],int size,int key){
        int start = 0;
        int end = size-1;
        int ans=-1;
        int mid = start + (end-start)/2;
        while(start <= end){
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;

            }
            else if(key > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            mid= start + (end-start)/2;   
    }
    return ans;
}
public static int lastPositionOfElement(int arr[] ,int size,int key){
    int start = 0;
    int end = size-1;
    int ans = -1;
    int mid = start + (end-start)/2;
    while(start <= end){
        if(arr[mid]==key){
            ans = mid;
            start = mid+1;
        }
        else if(key > arr[mid]){
            ans = mid;
            start = mid+1;
        }
        else {
            end = mid-1;
        }
        mid= start + (end-start)/2;   
}
return ans;
}
public static void main(String []args){
    int arr[] = {1,2,3,3,3,3,3,4,5};
    int occurrence1=firstPositionOfElement(arr, 9, 3);
    int occurrence2=lastPositionOfElement(arr, 9, 3);
    System.out.println("first postion of element is at index "+occurrence1);
    System.out.println("last position of element is at index "+occurrence2);
    System.out.println("now total no of occurrence of no 3");
    int totalOccurrence = (occurrence2 - occurrence1) + 1;
    System.out.println("3 comes in array "+totalOccurrence+" times");
}
}