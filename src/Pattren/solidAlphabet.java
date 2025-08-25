package Pattren;

public class solidAlphabet {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(char c='A';c<'A'+n;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
