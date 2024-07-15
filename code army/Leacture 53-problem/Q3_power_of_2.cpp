#include<iostream>
using namespace std;
int pow(int num,int n)
{
      if(n==1){
            return num;
      }
      return num*pow(num,n-1);
}
int main()
{
    int n,m;
    cin>>n;
    cout<<pow(2,n);  
    //cout<<"number is="<<n<<"power of number is="<<m<<"is="<<c;
}