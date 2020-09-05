n=int(input())
p=(3*n)+(2)
for i in range(1,p+1):
    if i%3==0:
        for j in range(5):
            print('*',end="")
    else:
        print('*',end="")
        for i in range(1,4):
            print(end=" ")
        print('*')
    print()
