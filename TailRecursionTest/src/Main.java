import javax.management.timer.Timer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(faciTailRec(25,1));
    }
    public static long faciRec(long n) {
        if(n==0) {
            return 1;
        } else if(n<0){
            throw new IllegalArgumentException();
        } else {//n>0
            return n * faciRec(n-1);
        }
    }
    public static long faciTailRec(long n, long total) {
        if(n==0) {
            return total;
        } else if(n<0){
            throw new IllegalArgumentException();
        } else {//n>0
            return faciTailRec(n-1,total*n);
        }
    }
}