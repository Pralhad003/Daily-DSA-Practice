//Print a 1 to N number
#include<iostream>
using namespace std;
void print(int n , int num){
      if(num>n)
      {
        cout<<num;
         return;
      }
      cout<<num<<" ";
      print(n,num+1);

}
int main()
{
 int n,num;
 cout<<"enter the staring number"<<endl;
 cin>>num;
 cout<<"Enter the ending number"<<endl;
 cin>>n;
 print( n,num);
return 0;

}