n=int(input())
sarr=[]
for i in range(n):
  v=input()
  sarr.append(v)
mval=min(sarr,key=len)
sarr.remove(mval)
for i in range(len(sarr)):
  for j in range(len(mval)):
     cval=sarr[i]
     if mval[:j+1]==cval[:j+1]:
       res=mval[:j+1]
     else:
       break
print(res)
  
