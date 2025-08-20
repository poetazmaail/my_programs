#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main(){
    int a,b;
    for (a=0; a<11; a++){
        b = rand();
        printf("\n%d",b);
    }
    return 0;
}