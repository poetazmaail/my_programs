number = int(input("Enter a number").strip())
original = number
sum = 0
reverse = 0

while number > 0:
    digit = number%10
    sum += digit
    reverse = reverse * 10 + digit
    number //= 10
print("Sum of digits is: ", sum)
print("Palindrom: ","Yes" if original == reverse else "No")