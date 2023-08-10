word = list(map(str, input()))
temp = word[::-1]

if word == temp:
    print(1)
else:
    print(0)