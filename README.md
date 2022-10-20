# JAVA-All-Basic

Java is a general-purpose and object oriented programming language originally developed by Sun Microsystem and released in 1995. 

>**Object:** An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc.

>**Class:** Class is a Blueprint, which holds it's own data members and members function. Class is a group of similar objects. It's a Logical entity.

Array : Arrays are objects that store multiple variables of the same type.

**Method:** A method is a block of code or collection of statements to perform a certain task or operation. Used to achieve the reusability of code.
>Method Overloading: If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.<br>

>Method Overriding: If a child class has a same method as declared in a parant class, it is known as Method Overriding.

What is Public static void main (String args[]) ?<br>

![](https://media.geeksforgeeks.org/wp-content/uploads/20220105123954/Group2-660x330.jpg)

>Public - It is an access specifier that means the main() method is accessible globally available. The public keyword tells the JVM that the scope of the code written is the whole project.

>Static - It is an access modifier means we can call this method directly using the class name without creating an object of it.

>Void - void is the return type. It means "this method returns nothing".

>Main - It is the name of the method. The main method is the entry point of a Java program for the Java Virtual Machine(JVM). 

>String args[] - It is array of string type and It stores Java command-line arguments. 

What is System.out.println()? <br>
In Java, System.out.println() is a statement which prints the argument passed to it. Where 
>System is the class name.<br>
>The out is an instance of the System class. <br>
>The println() method display results on the monitor. <br>

What is System.in in Java?<BR>
System.in is an InputStream which is typically connected to keyboard input of console programs.

What is Keyword in Java ?<br>
Keywords are predefined, reserved words used in Java programming that have special meanings to the compiler.<br>
  
>New keyword - In java, New keyword is basically used for creating objects. It allocates memory for an object.

>Extend keyword - The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.
  
>Static keyword - The static keyword is a non-access modifier used for methods and attributes. Static methods can be accessed without creating an object of a class.
  
>Super keyword - The super keyword in Java is a reference variable which is used to refer immediate parent class object.

>Final keyword - The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable. 
  
>This keyword - This keyword is used to refer to the current class properties like method, instance, variable and constructors.
  
Blank final variable: A final variable that have no value it is called blank final variable or uninitialized final variable.

What is JAR File ?<br>
A Java™ ARchive (JAR) file is a file format that combines many files into one.

DataType : A data type, in programming, is a classification that specifies which type of value a variable has and what type of mathematical, relational or logical operations can be applied to it without causing an error.

**Variable:** Variable is a reserved location in a memory to store some value.<br>

  Three types of variables in JAVA

> Local variables are declared in methods, constructors, or blocks.

> Instance variables are declared in a class, but outside a method, constructor or any block.

> Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.

**Constructor:** A constructor is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

Two types of constructors in JAVA
>No-Arg Constructor : A constructor is called "No-arg Constructor" when it doesn't have any parameter.<br>
  
>Parameterized Constructor : A constructor which has a specific number of parameters is called a parameterized constructor.<br>

What is Expression in JAVA ? <br>
Expressions are essential building blocks of any Java program, usually created to produce a new value, although sometimes an expression simply assigns a value to a variable.
  
What is Recursion in JAVA ? <br>
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

Java was a interpreted programming language , but after introducing JIT it was called as interpreted - compiled programming language<b>
  
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20210218150010/JDK.png" width="720" height="330">
  
![](JDK+RE+VM+IT.png)
  
  
  
 What is JDK ? Mention the variants of JDK. <br>
  JDK is a combined package of JRE and Developers tools used for designing JAVA applications. Oracle has the following variants.<br>
  1. JDK Sandard edition<br>
  2. JDK  Enterprise edition<br>
  3. JDK Micro edition<br>
  
![](Inheritance.png)<br><br>
![](MethodOverLR.png)
  
Features of JAVA:<br>
1.	Simple: JAVA is easy to learn and it’s syntax is quite simple, clean and easy to learn.<br>
2.	Object Oriented: In java everything is Object which has some data and behaviour.<br>
3.	Robust<br>
4.	Platform Independent: Java is guaranteed to be write-once, run-anywhere language. Not fully Independent. JVM is Platform Independent. <br>
5.	Secure: Java program always runs in Java runtime environment with almost null interaction with system OS, hence it is more secure.<br>
6.	Multi threading: Java multithreading feature makes it possible to write program that can do many tasks simultaneously.<br>
7.	Portable: Java Byte code can be carried to any platform.<br>
8.	Highly Performance: Java enables high performance with the use of just-in-time compiler.<br>

Can we call child class method using parant class object ?  
<a href="https://www.sololearn.com/Discuss/1351734/why-we-can-t-call-child-specific-methods-with-the-help-of-parent-reference-on-child-object-in-java#:~:text=Then%20the%20child%20class%20can,by%20using%20a%20parent%20reference.">Answer </a>

What is Associativity?<br>
Associativity specifies the order in which operators are executed, which can be left to right or right to left.

What is Association ?<br>
An Association can be defined as a relationship that has no ownership over another. For ex a Person can be associated with multiple banks and a bank can be associated with mutiple people. 

What is JIT ?<br>
JIT is an abbriviation for Just-in-Time Compiler. It increases efficiency of the interpreter by compiling the bytecode into native machine code at runtime.
  
   Advantages of JIT compiler : <br>
  1. The JIT compiler requires less memory usage <br>
  2. Code optimization can be done while the code is running.<br>
  3. It reduces the page faults.<br>
  4. It uses different levels of optimization.
  5. JIT increase the speed of program execution.


What is ClassLoader ?<br>
A classloader in Java is a subsystem of JVM, dedicated to load class files when a program is executed, Classloader is the first one to load the executable file. 

What are the Memory Allocations available in Java ? <br>
>Class memory

>Heap memory

>Stack memory

>Program counter memory

>Native method stack memory

Will the program run if we write static public void main?<br>
Yes, program will run successfully. In Java there is no specific rule for order of specifiers. 

What is the default value stored in Local variable?<br>
Neither the local variable nor any primitives and Objet have any default value stored in them. 

Define Copy constructor in Java ? <br>
A Copy Constructor in Java is a constructor that initializes an object through another object of the same class. 

What is Marker Interface ?<br>
An empty interface in Java is referred as a Marker interface. Serializable and Cloneable are some popular ex. of Marker Interface.

What is Object Cloning ?<br>
An ability to create an object completely similar to an existing object is known as Object Cloning. 

What is Wrapper classes in Java ?<br>
In Java when you declare primitive datatype then Wrapper classes are responsible for converting them into objects.

What is Package in Java?<br>
Package is a collective bundle of classes and interfaces along with the necessary libraries and JAR files.

Can you use pointers in Java ?<br>
JVM takes care of memory management implicitly. So we can not use pointers in Java.

Differentiate between Instance and Local variable.<br>
Instance variables are declared inside a class and the scope is limited to only a specific object. Local variable can be anywhere inside a method or a specific block of code. Also the scope is limited to the block of code where the variable is declared. 
  
What is String Pool ?<br>
A collection of strings in Java's Heap memory is referred as Java String pool. 

What is Execption in Java ?<br>
An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program.

What is Access Specifier and Types of Access specifier?<br>
Access Specifiers are predefined keywords used to help JVM with understanding the scope of a variable, method and class. We have four access specifier<br>
  > Public access specifier<br>
  > Private access specifier<br>
  > Protected access specifier <br>
  > Default access specifier<br>

 What is Late binding ?<br>
Binding is a process of unifying the method call with the method's code segment. Late binding happens when the method's code segment is unknown till the method is called during the run-time. 
  
What is Run time polymorphism ?<br>
Runtime polymorphism, also known as the Dynamic Method Dispatch, is a process that resolves a call to an overridden method at runtime. The process involves the use of the reference variable of a superclass to call for an overridden method.

What is Process in Java ?<br>
An executing instance of a proram is called a process. 

What is Thread in Java ?<br>
A thread in Java is the direction or path that is taken while a program is being executed. Generally, all the programs have at least one thread, known as the main thread, that is provided by the JVM. A thread is subset of process.
  
 Brief the life cycle of Applet ?<br>
  1. Initialization<br>
  2. Start<br>
  3. Stop<br>
  4. Destroy<br>
  5. Paint<br>
  
What is Garbage collection in Java ?<br>
Garbage collection is the mechanism used in Java to de-allocate unused memory, which is nothing but clear the space consumed by unused objects.
  
Explain Daemon thread <br>
The daemon thread can be defined as a thread with least priority. This Daemon thread is designed t run in the background during the process of Garbage collection. 
  
What is enumeration in Java ?<br>
An enumeration in Java is a special data type which contains a set of predefined constants.

Why Java is consider as a Dynammic?<br>
Java is considered as Dynamic because of Byte code. A source code written in one platform, that can be executed in any platform. And it also loads the class files at run time. Anything that happens at run time is considered as Dynamic.
  
What is JSP ?<br>
JSP is an abbreviation for Java Servlet Page. The JSP page consist of two types of text.<br>
  1. Static data<br>
  2. JSP elements<br>
  
What is JDBC ?<br>
JDBC is an abbreviation for JAVA Database connector. JDBC is an abstraction layer used to establish connectivity between an existing Database and a java application.

What is JCA ?<br>
Java Cryptography Architecture provides a plateform and gives architecture and APIs for encryption and decryption. JCA is used by the developer to combine the application with the security measure. It helps in performing the third party security rules. 
  
What is JPA in Java ?<br>
The Java Persistence API is a Java specification for accessing, persisting, and managing data between Java objects / classes and a relational database. JPA deals in following <br>
1. Java Persistence API <br>
2. Query language<br>
3. Java Persistence Criteria API<br>
4. Object Mapping Data<br>

What is Session Management ?<br>
Session management refers to the process of securely handling multiple requests to a web-based application or service from a single user or entity.

What is Spring Framework ?<br>
The Spring Framework is an application framework and inversion of control container for the Java platform.

What is Synchronization ?<br>
Synchronization in java is the capability to control the access of multiple threads to any shared resource.

  What is Functional Interface ?<br>
  An interface that contains only one abstract method is known as functional interface. It can have any number of default and static methods.
