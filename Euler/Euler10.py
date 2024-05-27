def primes(n):
    array = [True] * n
    for i in range(3,int(n**0.5)+1,2):
        if array[i]:
            array[i*i::2*i]=[False]*((n-i*i-1)//(2*i)+1)
    return [2] + [i for i in range(3,n,2) if array[i]]


def sum(array):
    sum = 0
    b = len(array):
    for i in range(len(array)):
        sum += array[i]

    return sum


print(sum(primes(2000000)))


