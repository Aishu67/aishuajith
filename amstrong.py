num=input()
s=0
for i in range(len(num)):
   s+=pow(int(num[i]),3)
if str(s)==num:
  print("yes")
else: 
  print("no")
