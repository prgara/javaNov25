instanceOf operator use ?
put vs putIfAbsent



ways to iterate over map ? -> 


arrayList of linkedList
default size of hashmap is 16.  
load factor 0.75 or 75%


How put method works :
- put("John",98)
- calculate the hashcode for key  ---- 1896361481 
- calculate the index/bucket using the modulo function  1896361481 % 16 = 2
- it will update the hashcode, key, value here

put("John",100)
- hashcode ->  1896361481
- index/bucket -> 2 
- if hashcode is same then it will use equals to check the key if it is same or not.
- if key is same then it will overwrite the value.


put("Sam",100)
- hashcode -> 1896361481
- index based on modulo -> 2
- hashcode same then it will check keys using equals.  false
- if euqla return false then it will go to next node
- if no node over there, it will create a node and HC,K,V will se saved over there


put("Harry",67)
- hashcode -> 1896567481
- index -> 14

get method working
- get("John")
- calculate hash
- find index -> 2
- if empty index return null
- compare hash
- compare equals
- return the value -100

equals & hashcode contract


create a student class and in main class create a map having student as  a key and integer as marks.
add 2 students in the map and print it.










