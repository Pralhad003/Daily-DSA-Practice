#include<iostream>
using namespace std;
void fun0(int n)
{
       cout<<"HAPPY BIRTHDAY"<<endl;
       
}
void fun1(int n)
{
       cout<<n <<"->day left to birthday"<<endl;
       fun0(n-1);
}
void fun2(int n)
{
       cout<<n <<"->day left to birthday"<<endl;
       fun1(n-1);
}
void fun(int n)
{
      cout<<n <<"->day left to birthday"<<endl;
      fun2(n-1);
}

int main()
{
      int n;
      cout<<"enter the number"<<endl;
      cin>>n;
      for(int i=0;i>0;i--)
      {
           
       cout<<i <<"->day left to birthday"<<endl; 
      }
      fun(n);
      
}