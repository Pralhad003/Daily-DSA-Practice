package Arrays;

public class arraySubset {
    public static boolean subset(int[] a1,int[] a2){
        int n=a1.length;
        int m=a2.length;
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(a2[i]==a1[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int  a1[] = {1, 2, 3, 4, 5, 6};
       int a2[] = {1, 2, 4};
       if(subset(a1,a2)){
           System.out.println("yes");
       }else{
           System.out.println("No");
       }

    }
}
