#include <stdio.h>
int main() {
	int a,i,b,c=0,e;
  scanf("%d",&a);
  b=a;
 while(a>0)
 {
   a=a/10;
   c=c+1;
 }
  int d=c-2;
  while(d>0)
  {
    b=b/10;
    d=d-1;
  }
  e=b%10;
  printf("%d",e);
    
  
	return 0;
}