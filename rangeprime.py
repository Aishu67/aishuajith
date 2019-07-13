x,y=map(int,input().split
res=[]
for i in range(x+1,y):
    if i>1:
      for j in range(i):
         if i%j==0:
            continune
       else:
         res.appen(i)
     else:
        continue
print(*res)
