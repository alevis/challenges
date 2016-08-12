#include  <stdio.h>
int main(void)
{
    long long unsigned int n;
    int testcases,i=0,m;
    scanf("%d",&testcases);
    while(i<testcases){
        scanf("%d",&m);n=m;
        printf("%llu",(n-(n/2))*(n/2));
        printf("\n");i++;
    }
    return 0;
}