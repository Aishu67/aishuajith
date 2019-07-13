x,y=map(int,input().split())
res=[]
for num in range(x+1,y):
   snum=str(num)
   s=0
   for i in range(len(snum)):
      s+=pow(int(snum[i]),3)
   if s==num:
       res.append(num)
print(*res)
