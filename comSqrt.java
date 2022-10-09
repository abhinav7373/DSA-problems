public class comSqrt {
    public static int squareRoot(int no){
        int s =0;
        int e=no;
        int mid = s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            int square = mid*mid;
            if(square == no){
                return mid;
            }
            if(square < no){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
              mid = s+(e-s)/2;
        }
        return ans;
    }
    public static float finalSquareRoot(int no,int precision,int res){
        float ans = res;
        float factor = 1;
        for(float j =0;j<precision;j++){
            factor = factor/10;
        for(float i = res;i*i<no;i=i+factor){
            ans = i;
        }
    }
        return ans;
    }
    public static void main(String []args){
        int res = squareRoot(27);
        System.out.println(finalSquareRoot(27,3,res));
    }
}
