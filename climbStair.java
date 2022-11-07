public class climbStair {
    public static int stair(int no){
        if(no<0){
            return 0;
        }
        if(no==0){
            return 1;
        }
        return stair(no-1)+stair(no-2); 
    }
     public static void main(String []args){
            int n=3;
            int ans = stair(n);
            System.out.println(ans);
     }
}
