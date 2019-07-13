x,y=map(int,input().split())
res=[]
for i in range(x+1,y):
    if i%2==0:
      res.append(i)
print(*res)
