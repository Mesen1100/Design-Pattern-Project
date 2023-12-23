# sport movie child tvshow
import random


s=open("sportchannel.txt","w")
m=open("moviechannel.txt","w")
c=open("childchannel.txt","w")
files=[s,m,c]

channels=sorted(random.sample(range(1, 200), 60))

print(channels)
a=0
for j in range(1,20):
    for i in files:
        i.write(str(channels[a])+"\n")
        a=a+1
i.close()