#include <stdio.h>

int calc(int b,int p){

    if(p==0)

        return 1;

    return b*calc(b,(p-1));

}

int main()

{

    int b,p;

    printf("Enter the base value:");

    scanf("%d",&b);

    printf("Enter the power value:");

    scanf("%d",&p);

    printf("The value of %d the base %d is: %d",b,p,calc(b,p));

}
