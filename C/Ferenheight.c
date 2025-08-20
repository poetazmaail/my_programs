#include<stdio.h>
int main(){
float temperature;
printf("Enter the temperature in Celcius: ");
scanf("%f",&temperature);
float F = 9*temperature/5 + 32;
printf("The temperature is %f in Ferenheight",F);

return 0;
}
