package Sort;

public class margeTwoArray {
    public static void main(String[] args) {
        int a[]={10,23,43,54,99};
        int b[]={30,33,45,66,75,78};
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        System.out.println("result->");
        for(int ele :c){
            System.out.print(ele+" ");
        }
    }
}
