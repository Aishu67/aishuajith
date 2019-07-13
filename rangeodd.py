x,y=map(int,input().split())
res=[]
if x==1 or x==0:
    x=2
for i in range(x,y+1):
    if i%2!=0:
       res.append(i)
print(*res)
