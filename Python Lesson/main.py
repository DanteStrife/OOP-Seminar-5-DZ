
# 1.

# n = 5.897

# print(n)

# n = 'fsds'

# print(n)
# n1 = "sd\'fsg"

# s = 3
# print(type(s))


# 2. 

# a =5
# b = 9
# c ='hello'

# print(a, '-', b, '-',c)

# print(f"{a} - {b} - {c}")

# print("{} - {} - {}".format())

# 3.

# print('Введите первое число: ')
# a = input()
# b = input('Введите второе число: ')


# c = 5.908
# print(c)
# n = int(c)
# print(n)

# 4. 

# print('Введите первое число: ')
# a = input()
# b = input('Введите второе число: ')


# c = 5.908
# print(c)
# c = int(type(c))
# print(c)
# print(type(c))

# 5.

# c = 5.908
# print(c)
# print(type(c))
# c = bool((c))
# print(c)
# print(type(c))

# 6.

# print('Введите первое число: ')
# a = int (input())
# b = int(input('Введите второе число: '))

# print(a, '+', b, '=', a + b)


# 7.

# a = 4.6344
# b = 6.234
# print(round(a*b,3))


# 8. 

# iter = 2
# iter += 3 # iter = iter + 3 
# iter -= 4 # iter = iter - 4
# ...


# 9.

# a = 1 < 4 and 5 > 2
# print(a)
# a = 1 == 2
# print(a)
# ...

# 10. 

# i = 0
# while i < 5 :

#     i = i + 1
# else:
#     print('Пожалуй')
#     print('хват')
# print(i)

# 11.

# n = int(input())
# flag = True
# i = 2 
# while flag:
#     if n % i == 0: # Если остаток при делении n на i равен 0
#         flag = False
#         print(i)
#     elif i > n // 2: # делить числа не может превышать введенное число, деленное на 2 
#         print(n)
#         flag = False
#     i += 1

n = 385916

s = n // 1000
f1 = s % 10
s = s // 10
f2 = s % 10
s = s // 10

a = f1 + f2 + s

r1 = n % 10
r = n // 10
r2 = r % 10
r = (r // 10) % 10

b = r1 + r2 + r
if a == b:
    print("yes")
else:
    print("no")