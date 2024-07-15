//Print a 1 to N Even number
#include<iostream>
using namespace std;
void print(int num , int n){
      if(num==n)
      {
        cout<<num<<endl;
         return;
      }
      cout<<num<<" ";
      print(num+2,n);

}
int main()
{
 int n,num;

 cout<<"Enter the number"<<endl;
 cin>>n;
 if(n%2==1)
 n--;
 print(2,n);


}