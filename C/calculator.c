#include<stdio.h>
#include<conio.h>
//'Tis not working.

void main(){
char c;
int a,b,sum;
printf("Enter two values: ");
scanf("%d%d",&a,&b);
printf("Enter a character");
scanf("%c",&c);
switch(c){
 case '+':
     sum = a + b;
     printf("Sum is %d ", sum);
     break;
 case '-':
    sum = a-b;
    printf("sum is %d", sum);
    break;
defualt:
    printf("Give a right number please");

}
getch();

}
