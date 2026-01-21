## Recap

Abstraction and interfaces


split in 2-3 groups and prepare PPT on any of the 1 topic
- JVM,JRE,JDK
- Garbage collection
- Serialization/deserialization

Exception -> which breaks the normal flow of the program.
- Application issue
- Handled
- Graceful recovery

# Exception Handling
It is to handle the exception scanerios gracefully to maintain the normal flow of the program

Why ?


Error -> It is ir-reversible condition from which you cannot recover. Out of memory, stackoverflow
- JVM issue
- Not handled
- System crash


Throwable -> parent class of all the exceptions
Exception and error


                       Throwable
                           
                 Exception                Error


# Type of exceptions
- Checked exception (Compile time exception) -> IOException, InterruptedException
- Unchecked exception (Runtime exception) -> Arithmetic, NullPointer


How to handle exception -> try, catch, finally, throw, throws

try {
 // risky code
} catch (// exception) {
            
}

1. JVM detect exception
2. create exception object
3. search for matching catch block
4. execute the catch

try { 
risky code
} catch () {}
finally {} -> which always gets exceuted no matter what


why finally ? -> Resource cleanup
DB 
exception ->


try with finally

- WAP to have an array with size 5 but try to add 6 elements and handle that exception.


try with catch
try with finally
try with catch & finally