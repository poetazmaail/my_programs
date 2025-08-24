name1 = input("Enter your name: ")
name2 = input("Enter your crush's name: ")
combined_String = name1 + name2

lower_case_string = combined_String.lower()

t = lower_case_string.count("t")
r = lower_case_string.count("r")
u = lower_case_string.count("u")
e = lower_case_string.count("e")

TRUE = t+r+u+e

l = lower_case_string.count("l")
o = lower_case_string.count("o")
v = lower_case_string.count("v")
e = lower_case_string.count("e")

LOVE = l+o+v+e

love_score = str(TRUE) + str(LOVE)

print(f"Your love score is {love_score}")
