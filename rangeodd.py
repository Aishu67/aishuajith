x,y=map(int,input().split())
res=[]
for i in range(x,y+1):
    if i%2!=0:
       res.append(i)
print(*res)
