# Recap

throw vs throws

generics ? why ? Type safety, No classCastExecption runtime



Immutability -> An object whose state cannot be changed after creation
String, Integer, Float
constant -> private final

How to create an immutable class
- make class as final
- No setter methods
- make var as private final


Collection -> it is a framework which is set of interfaces and classes to store and manipulate group of objects.
Objects(wrapper classes), Generics

                                Iterable [I]                                       Map<K,V>
                                    /                                              HashMap
                                Collection [I]
                                    /
         List[I]                      Set[I]                         Queue[I]         
        ArrayList                   HashSet                          Deque, Priority Queue
        LinkedList,Stack            LinkedHashSet, TreeSet



ArrayList -> it is dynamic in nature, size can be changed automatically

JAVA 7
by default list of 10 size will be created.
100% capacity then it will grow to 16.
n+n/2+1 = 10+5+1=16 


JAVA 8
INITIALLY YHE SIZE WILL BE 0.
Once you put the first element then size will grow to 10.



arraylist is of continguos memory location.
search operation is fast.

but indexes must be continuous.
12,13,14,15,16,20

array is length
arrayList -> size[5] and capacity [10]


by default value for wrapper -> Integer    null  
int by default -> 0


1 million elements in a list
add element at 5th index
manipulation in arraylist is a costly operation. adding and removing element frequently

10,20,30,40,50,80,60...........................

100 elements to be stored ...  array or arrayList (array is faster)

https://codeanddebug.in/blog/time-complexity-and-space-complexity/


Loop over collections
Iterator -> object which is used to iterate over the ele of collections.


fori, for each then why iterator ? ConcurrentModificationException



Given a list of integers
- find min, max, sum, avg, count even/odd, revers the list











