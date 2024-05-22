def sumsquare(a):
    value = 0;
    sum = 0;
    for i in range(1, a+1):
        value += pow(i,2)
        sum += i

    print(pow(sum,2)-value)


sumsquare(100)