from fractions import Fraction

def fac(x):
    result = 1
    for i in range(1,x+1):
        result *= i
    return result

def bionom(n, k):
    return fac(n)/(fac(n-k)*fac(k))

total = 0 

for n in range(10):
    if(n % 2 == 0):
        total += float(bionom(n,n/2))/float((2**n))
        print(Fraction(total))