# IDE: PyCharm
letters = "abcdefgh"


def letters_to_index(location):
    str(location)
    for x in letters:
        if location[0] == x:
            return letters.index(x)


def black_or_white(location):
    index = letters_to_index(location)
    if index % 2 == 0 and int(location[1]) % 2 != 0:
        return "black"
    elif index % 2 == 0 and int(location[1]) % 2 == 0:
        return "white"
    elif index % 2 != 0 and int(location[1]) % 2 == 0:
        return "black"
    else:
        return "white"


location = input('Enter chess location: ')
print(black_or_white(location))
