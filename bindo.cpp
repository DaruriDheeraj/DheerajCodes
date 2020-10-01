#include <iostream>
#include<time.h>

using namespace std;
void display(int a[][10],int n) {
    int i,j;
    for(i=0;i<n;i++) {
        for(j=0;j<n;j++) {
            cout<<a[i][j]<<" ";
            }
            cout<<endl;
    }
}
void search(int a[][10],int n,int p) {
    int i,j;
       for(i=0;i<n;i++) {
           for(j=0;j<n;j++) {
               if(a[i][j]==p) {
                   a[i][j]=0;
               }
           }
       }
   } 
void del(int b[],int t,int l) {
      for(int i=0;i<=l;i++) {
      b[i]=b[i+1];
      }
      t--;
}
bool find(int a[][10],int n) {
    if((a[0][0]+a[1][0]+a[2][0]+a[3][0])==0)
    return true;
   else if(a[0][0]+a[0][1]+a[0][2]+a[0][3]==0)
     return true;
   else if(a[1][0]+a[1][1]+a[1][2]+a[1][3]==0)
    return true;
   else if(a[2][0]+a[2][1]+a[2][2]+a[2][3]==0)
    return true;
    else if(a[3][0]+a[3][1]+a[3][2]+a[3][3]==0)
    return true;
    else if(a[0][3]+a[1][3]+a[2][3]+a[3][3]==0)
    return true;
    else if(a[0][0]+a[1][1]+a[2][2]+a[3][3]==0)
    return true;
    else if(a[0][3]+a[1][2]+a[2][1]+a[0][0]==0)
    return true;
    else
    return false;
}
int main()
{
    char win;
    do {
    int a[10][10],n=4,i,t,j,p,num,y=0,b[100],gen=0,start=0,flag=0,flag1=0,c=0;
    srand(time(0));
    cout<<"Let's Play BINGO!!!!"<<endl;
    cout<<"--------------------------------------------"<<endl;
    for(i=1;i<=100;i++) {
    b[gen++]=i;
    }
    for(i=0;i<n;i++) {
        for(j=0;j<n;j++) {
            a[i][j]=(rand()%100)+1;
        }
    }
t=sizeof(b)/sizeof(b[0]);
while(y<36) {
p=rand()%t;
del(b,t,p);
cout<<"--------------------------------------------"<<endl;
 display(a,n);
 cout<<"Type the number if you see that in list"<<endl;
 cout<<b[p]<<endl;
 cout<<"Type the above number if you see that in list or else press 26"<<endl;
 cin>>num;
 if(num!=26)
 search(a,n,num);
 cout<<"The numbers below right now are:"<<endl;
 display(a,n);
 cout<<"----------------------------------------------------"<<endl;
 cout<<endl;
 start++;
 if(start>=4) {
     if(find(a,n)) {
         flag=1;
         break;
     }
}
y++;
if(y==35) {
    flag1=1;
    break;
}
}
if(flag==1) {
 cout<<"You won the game\n";
}
if(flag1==1)
cout<<"You loose the game but don't worry press y to try again\n";
cout<<"Do you want to ply again\n";
cin>>win;
}while(win=='y' or win=='Y');
return 0;
}