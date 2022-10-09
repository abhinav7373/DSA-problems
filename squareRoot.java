import java.nio.channels.ReadPendingException;

//here we find square root of no for only int(eg.6.57=6 will ans)
public class squareRoot {
    public static long findSquareRoot(long no){
        long s =0;
        long e  = no;
        long mid  = s + (e-s)/2;
        long ans =-1;
        while(s <= e){
            long square = mid*mid;
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
            mid  = s + (e-s)/2;
        }
        return ans;

    }
    public static void main(String []args){
       long res =  findSquareRoot(27);
       System.out.println(res +" is square root of the no");
    }
}