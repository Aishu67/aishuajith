x,y=map(int,input().split())
res=[]
s=0
for num in range(x+1,y):
   for i in range(len(str(num))):
      s+=pow(num[i],3)
   if s==num:
       res.append(num)
print(*res)
   
