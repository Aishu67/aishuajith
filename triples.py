n=int(input())
arr=list(map(int,input().split()))
c=0
if len(arr)==n:
 for i in range(n-2):
    for j in range(i+1,n-1):
        for k in range(i+j,n):
          if arr[i]>arr[j]>arr[k] and i<j<k:
              c+=1
 print(c)
else:
    print(1)
