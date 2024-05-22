def euler1001(a):

    target = 0
    starting = 2

    while(target != a):
        flag = False
        for i in range(2,starting):
            if(starting%i == 0):
                flag = True;
                break;
            else:
                flag = False;
        if(flag == False):
            target+=1
        if(target != a):
            starting+=1
    return starting


print(euler1001(999))
