public class bookAllocation {
    public static boolean isPossible(int arr[],int n,int m,int mid){
         int studentCount=1;
         int pageSum = 0;
         for(int i=0;i<n;i++){
            if(pageSum + arr[i]<=mid){
                pageSum+= arr[i];
            }
            else{
                studentCount++;
                if(studentCount > m || arr[i]>mid){
                    return false;
                }
                pageSum = arr[i];
            }
         }
         return true;
    }
    public static int bookAllocate(int arr[],int n,int m){
        int s = 0;
        int sum=0;
        int ans = -1;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int e = sum;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(isPossible(arr,n,m,mid)){
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
        int arr[] = {5,10,15,20};
        int m=2;
        int n=4;
        int res = bookAllocate(arr, n, m);
        System.out.println(res);
    }
}
