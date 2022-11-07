public class countR {
    public static void print(int no){
        if(no==0){
            return;
        }
        print(no-1);
        System.out.print(no);
    }
    public static void main(String []args){
        int n= 5;
        print(n);
    }
}
