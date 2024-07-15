#include<iostream>
using namespace std;
int sum_of_square_natural(int n)
{
      int sum=0;
      for(int i=1;i<=n;i++)
      sum+=i*i;
      return sum;
}
int main()
{
      int n;
      cin>>n;
      cout<<sum_of_square_natural(n);
}