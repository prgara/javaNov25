## Recap


Animal a = new Dog();  // upcasting
can we override static method ? method hiding

Runtime polymorphism

     

this keyword → current object
super keyword → parent object

It is used to access to parent variables, methods and constructor.


Encapsulation → bundling of data & methods in a single unit.
data hiding to control the class
It can give us flexibility who can access what.

Why encapsulation
- Data protection
- Control
- Validations

WAP to create BankAccount class having fields private balance, deposit(), withdrwal(), showBalance()
No one is allowed to do negative deposit, withdraw only if you have sufficient bal



Modifier in java
- Access modifier → public , private, default , protected (Visible to package and in subclasses in different package)
- non access modifiers → static, synchronized, abstract



Abstraction → process of hiding the implementation and showing only necessary functionality to the user.
it gives you an idea what supposed to be done but how you do it depends on child class.
there are 2 ways to achieve abstraction
- abstract keyword [0-100 %]
- interface [100 %]
Characteristics
- No object can be created for abstract class
- It may or may not have abstract method
- abs method does not have body


Abstract class car -> start, break, reverse, engine
Ford -> has all the basic features

