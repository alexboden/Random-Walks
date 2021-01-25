from random import *

highest_n_value = 10
simulations = 1000000000
for n in range(highest_n_value):
    average = 0.0
    for i in range(simulations):
        position = 0.0
        for j in range(n):
            x = randint(1,2)
            if (x==1):
                position+=1
            else:
                position -=1
        average += abs(position)
    
    print("Average for {}: {}".format(n,average/simulations))