#include<stdio.h>
int main(){
float basic_salary, d_allowance, house_rent;
printf("Enter basic salary: ");
scanf("%f",&basic_salary);
d_allowance = 0.4 * basic_salary;
house_rent = 0.2 * basic_salary;
int gross_salary = basic_salary + house_rent+d_allowance;
printf("The gross salary is %d",gross_salary);
return 0;
}
