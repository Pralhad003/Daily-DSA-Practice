//Print a 1 to N number
#include<iostream>
using namespace std;
void print(int n ){
      if(n==1)
      {
            cout<<1<<endl;
            return;
      }
print(n-1);
cout<<n<<endl;
}
int main()
{
 int n,num;
 
 cout<<"Enter the ending number"<<endl;
 cin>>n;
 print( n);
return 0;

}