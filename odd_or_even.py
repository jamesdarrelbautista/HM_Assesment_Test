def odd_or_even(num):
    if num % 2 == 0:
        return "even"
    else:
        return "odd"


num = int(input("Enter a number: "))
print(odd_or_even(num))
