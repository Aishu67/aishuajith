x,y=map(int,input().split())
res=[]
for i in range(x+1,y):
    if i>1:
      for j in range(2,i):
         if i%j==0:
            break
      else:
         res.append(i)
    else:
        continue
print(*res)
