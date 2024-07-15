public class main
{
      public static  int sumofelement(int arr[],int index,int n)
      {
            if(index==n)
            {
                  return 0;
            }
            return arr[index]+sumofelement(arr,index+1,n);
      }
public static void main(string[] arg)
{
     int arr[]={3,4,5,8,2};
     int n =arr.length;
     int sum=sumofelement(arr,0,n);
     system.out.println("sum of element"+sum); 
}
}