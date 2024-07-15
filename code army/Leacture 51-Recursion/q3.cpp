#include<iostream>
using namespace std;
void fun(int n)
{
      if(n==0)
      {
            cout<<"HAPPY BIRTHDAY"<<endl;
              return;
      }
      cout<<n<<"-> day left"<<endl;
      fun(n-1);

}
int main()
{
      int n=5;
      fun(5);
      return 0;
}