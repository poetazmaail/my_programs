#include<stdio.h>
#include<conio.h>
//COde is not running properly!
void main(){

int a[50];
int size, pos, number;
printf("Enter the size of the array: ");
scanf("%d",&size);
printf("Enter array elements:\n ");
for (int i = 0; i < size; i++){
    scanf("%d",&a[i]);
}
printf("Your elements are:\n ");
for (int i = 0; i <size; i++){
    printf("%d\n",a[i]);
}
printf("Enter the position: ");
scanf("%d",&pos);
printf("Enter the number you want to insert: ");
scanf("%d",&number);
for (int i = size - 1; i >=pos-1; i--){
    a[i+1] = a[i];
}
a[pos-1] = a[number];
size++;
printf("After inserting your new elements are: \n");
for (int i = 0; i <size; i++){
    printf("%d",a[i]);


}
}
