# Stack
It is a data structure which follow LIFO.

push -> add an element in stack
pop -> take out an element
peek -> see the top most element

stack is slower bcoz methods are synchronized.
ArrayDeque instead of stack.



# Set
- Part of collection framework
- no duplicates
- order may or may not be maintained.
- no index

- HashSet -> no duplicates and does not maintain order, 1 null allowed
- LinkedHashSet -> no duplicates, maintain insertion order, slightly slower than HashSet, 1 null allowed
- TreeSet - no duplicates, maintain natural sorting order, no null allowed, slower than HashSet.

arrayList of Linked List


- Given arrayList, remove duplicates from the list.
- Create a list of employees with name, id, salary and remove the duplicate employees from the list. 



hashcode(),equals() -> by default they compare object memory instead of data.
calculate hashcode and if hashcode is same then it uses equals method to check whether the object is same or not.


== -> memory
equals -> data


equals and hashcode contract


primary key in databse table -> unique



ConcurrentModificationException
fail fast vs fail safe 
fail safe (Slow bcoz of copy overhead) -> does not throw exception while iterating over it. CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentHashMap
fail fast (faster) -> Immediately throws an exception if collection is modified during iteration. ArrayList, LinkedList, HashSet,HashMap
fail safe works on copy rather than the original collection.

iterator will never give you ConcurrentModificationException.



Big O notation

## Time complexity

               Add                   Remove                       Search
ArrayList      O(1)                  O(n)                           O(1)

LinkedList     O(1)                  O(1)                           O(n)

HashSet        O(1)                  O(1)                           O(1)

add(index,ele) -> O(n)


