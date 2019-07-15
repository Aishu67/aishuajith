n=int(input())
sarr=[]
for i in range(n):
  v=input()
  sarr.append(v)
mval=min(sarr,key=len)
sarr.remove(mval)
for i in range(len(mval)):
  for j in range(len(sarr)):
     cval=sarr[j]
     if mval[:i+1]==cval[:i+1]:
       res=mval[:i+1]
     else:
       break
print(res)
