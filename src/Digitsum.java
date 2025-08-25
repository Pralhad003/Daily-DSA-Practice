public class Digitsum {
    public static void main(String[] args) {
        int n=48;
       // int sum=0;
        while(n>9) {
            int sum = 0;
            while (n > 0) {
                 sum += n % 10;
                n /= 10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}
