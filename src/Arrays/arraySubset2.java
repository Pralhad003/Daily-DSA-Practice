package Arrays;
import java.util.*;
public class arraySubset2 {
    public static boolean subset(Integer a1[],Integer a2[]){
        HashSet<Integer>set=new HashSet<>();
        for(Integer num :a1 ){
            set.add(num);
        }
        for(Integer num : a2){
            if(!set.contains(num))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Integer a1[] = {1, 2, 3, 4, 5, 6};
        Integer a2[] = {1, 2, 4};
        if(subset(a1,a2)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
}
