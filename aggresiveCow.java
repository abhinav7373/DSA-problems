import java.util.Arrays;
public class aggresiveCow {
    public static boolean isPossible(int arr[],int m,int mid){
        int cowCount=1;
        int lastPos= arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]-lastPos>=mid){
               cowCount++;
               if(cowCount == m){
                return true;
               }
               lastPos=arr[i];
           }
        }
        return false;
   }
   public static int bookAllocate(int arr[],int m){
       Arrays.sort(arr);
       int s = 0;
       int maxi=-1;
       for(int i=0;i<arr.length;i++){
           maxi = Math.max(maxi, arr[i]);
        }
        int ans = -1;
       int e = maxi;
       int mid = s+(e-s)/2;
       while(s<=e){
           if(isPossible(arr,m,mid)){
               ans = mid;
               e=mid-1;
           }
           else{
               s=mid+1;
           }
           mid = s+(e-s)/2;
       }
       return ans;
       
   }
   public static void main(String []args){
       int arr[] = {4,2,1,3,6};
       int m=2;
       int res = bookAllocate(arr, m);
       System.out.println(res);
   }
}
