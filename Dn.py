from fractions import Fraction
 
def fac(x):
    result = 1
    for i in range(1,x+1):
        result *= i
    return result

def bionom(n, k):
    return fac(n)/(fac(n-k)*fac(k))

highest_n_value = 10
for n in range(highest_n_value):
    dn = 0
    for k in range(1, n+1):
        if((n+k)%2 == 0):
            dn += bionom(n,(n+k)/2)*2*k
    
    print('{}'.format(Fraction(dn, 2**n))) 