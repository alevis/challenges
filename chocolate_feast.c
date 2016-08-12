#include <stdio.h>
int main(void){int toeat,answer,t,n,c,w,i=0;
    scanf("%d",&t);
    while(i<t){ scanf("%d%d%d",&n,&c,&w);
        toeat = n/c; answer=toeat;
        while(toeat>=w){toeat=toeat-w+1;
            answer++;
        }
        printf("%d\n",answer);i++;
    }
    return 0;
}