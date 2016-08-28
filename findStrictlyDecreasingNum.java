/**
 * Created by fangjiajing on 16/8/28.
 */
public class findStrictlyDecreasingNum {
    public static void find(int start,String out,int n){
        if (n==0){
            System.out.print(out + " ");
        }
        for (int i=start;i>=0;i--){
            /*
            out += i; 直接就位数不对 98 987 这样
             */
            String str = out+i;
            /*
            find(start-1,str,n-1); 会出现88 77 这种
             */
            find(i-1,str,n-1);
        }

    }
    public static void main(String[] args){
        int n=2;
        find(9,"",n);
    }
}
