#include<iostream>
using namespace std;
int fibbo(int n)
{
      for(int i=0;i<n;i++)
      if(n==1 || n==2)
      {
            return 1;
      }
      return fibbo(n-1)+fibbo(n-2);
}
int main()
{
      int n;
      cin>>n;
      int c= fibbo(n);
cout<<"number is="<<c;
return 0;

}