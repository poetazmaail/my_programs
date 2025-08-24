a = int(input("Enter year: "))

if a%4 == 0:
    if a%100 == 0:
        if a%400 == 0:
            print(f"{a} is leap year.")
        else:
            print("It is not leap year!")
else:
    print("It is not leap year")
