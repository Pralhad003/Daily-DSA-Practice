import java.util.Scanner;

public class sixFriend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int doubleroom =3*x;
        int tripleroom=2*y;
        System.out.println(Math.min(doubleroom,tripleroom));
    }
}
