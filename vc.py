val=input()
l=["a","e","i","o","u","A","E","I","O","U"]
if((val>='a' and val<='z') or (val>='A' and val<='Z')):
  if val in l:
     print("Vowel")
  else:
     print("Consonant")
else:
   print("invalid")
