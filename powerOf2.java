import java.util.Scanner;
public class powerOf2 {
    public static int power(int n){
        if(n==0){
            return 1;
        }
        int problem = power(n-1);
        return problem;
    }
    public static void main(String []args){
        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        int ans = power(no);
        System.out.println(ans);
    }
}