## recap

Encapsulation

Abstraction


Problems w/o abstraction
-tight coupling
-cannot switch payment type dymaically 
-SOLID principle -> Open/closed principle
class should be open for extension and closed for modificiation
- client knows the implemnetation details


Hide how something is done
Expose what needs to be done
Enable the loose coupling




It does not have  a body
No obj
may or may not have abs method





Car -> steering/drive, accelartor, stop
how engine works, 



WAp 
create an abstract class RemoteControl which will have public method start(), hidden methods like loadbattery(), switchOn()



# Interface [100%]

It is a contract which a implementing class has to fullfil

All the methods in the interface are by default public & abstract

Make use of implement keyword to inherit the interface
It cannot have concrete method.
All the variables/data members in the interafce are by default public, static and final.
Interface cannot have a constructor
Interface cannot be instantiated.



non-access modifiers -> abstarct, static, sync, final


final var -> its value cannot be changed. constant
final method -> it cannot be overridden
final class -> cannot be inherited

can we make a abs class as final ? -> No


why we need interface when we have abstract class ? -> Multiple inh



Class - class -> extends
class - interface -> implements
int - int -> 





- create an interface called Logger with a method log(String msg). implement FileLogger, Dblogger, CloudLogger
- create a smart printer which can have capabilty to print, scan and fax. -> different interfaces and 
- it should be implenented by smartprinter class


- Inner class -> it is a class defined inside a class
- To make th code more readable and maintable by grouping related classes together

- Wrapper class -> Collections work with objects only not with primitive data types
- int -> Integer
- float -> 

Autoboxing -> process of convertoing primitive to wrapper class
unboxing -> wrapper to primitive

Package ->  it is a namspace that group relatred classes and files or interfaces

- user defined and
- built in -> util, lang





















