import java.util.Scanner;
public class sayDigit {
    public static void identify(int no,String arr[]){
        if(no==0){
            return;
        }
        int rem = no%10;
        no=no/10;
        identify(no, arr);
        System.out.print(arr[rem]+" ");
    }
    public static void main(String []args){
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        identify(no,arr);
    }
}
