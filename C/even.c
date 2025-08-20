#include<stdio.h>
#include<conio.h>

void main(){
int a;
printf("Enter a number: ");
scanf("%d",&a);
int c = a%2 == 0 ? 1:0;
if (c==1){
    printf("Even");
}else { printf("odd");
}




}
