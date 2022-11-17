# JAVA-All-Basic

Java is a general-purpose and object oriented programming language originally developed by Sun Microsystem and released in 1995. 

>**Object:** An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It's an Physical representation of things or we can say that it's a Instance of a class.

There are 3 ways to initialize object in Java.<br>
1. By reference variable<br>
2. By Method<br>
3. By constructor

>**Class:** A class is a group of objects which have common properties or Class is a Blueprint, which holds it's own data members and members function. It's a Logical entity.

What is Array?<br>
Arrays are objects that store multiple variables of the same type. Arrays are of fixed size.

What is ArrayList?<br>
An ArrayList class is a resizable array, which is present in the java. util package. While built-in arrays have a fixed size, ArrayLists can change their size dynamically. 

**Method:** A method is a block of code or collection of statements to perform a certain task or operation. Used to achieve the reusability of code.
>Method Overloading: If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.<br>

>Method Overriding: If a child class has a same method as declared in a parant class, it is known as Method Overriding.

What is Static method?<br>
A method that belongs to a class rather than an instance of a class is known as a static method. 

What is Instance method?<br>
The method of the class is known as an instance method.

>What is Inheritance ?<br>

Inheritance is a mechanism in which child class acquires the property of parenparent class.

>What is Polymorphism ?<br>

Polymorphism is the ability of an object to identify as more than one type. <br>

Two types of Polymorphism in Java
1. Dynamic polymorphism: Dynamic polymorphism is a process in which a call to an overridden method is resolved at run time. That's why it's called runtime polymorphism. Ex. Method overriding<br>
2. Static polymorphism:  A polymorphism that is resolved during compile time is known as static polymorphism. - Compile time polymorphism Ex. Method overloading<br>


![image](https://user-images.githubusercontent.com/72852725/199137766-3334cbab-857a-4f98-b9a6-6aca76a6ef89.png)


>What is Abstraction ? <br>

Hiding internal details and showing functionality to the user is known as abstraction. For example phone call, we don't know the internal processing.

What is Abstract method ?<br>
A method which is declared as abstract and does not have implementation is known as an abstract method.

What is Abstract class <br>
An abstract class is a template definition to methods and variables of a class that contains one or more abstracted methods.

>What is Encapsulation ? <br>

Binding code and data together into a single unit are known as encapsulation.

What is Access Modifier ? <br>
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class.

>Four types of Access modifier in Java :
1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.<br>
2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.<br>
3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.<br>
4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.<br>

What is Access specifier ?<br>
An access specifier is a defining code element that can determine which elements of a program are allowed to access a specific variable or other piece of data.

What is Public static void main (String args[]) ?<br>

![](https://media.geeksforgeeks.org/wp-content/uploads/20220105123954/Group2-660x330.jpg)

>Public - It is an access specifier that means the main() method is accessible globally available. The public keyword tells the JVM that the scope of the code written is the whole project.

>Static - It is an access modifier means we can call this method directly using the class name without creating an object of it.

>Void - void is a no return datatype. It is a keyword and is used to specify that a method doesn't return anything. 

>Main - It is the name of the method. The main method is the entry point of a Java program for the Java Virtual Machine(JVM). Without main() method JVM will not execute the program. 

>String args[] - It is array of string type and It stores Java command-line arguments. 

What is System.out.println()? <br>
In Java, System.out.println() is a statement which prints the argument passed to it. Where 
>System is the class name.<br>
>The out is an instance of the System class. <br>
>The println() method display results on the monitor. <br>

What is System.in in Java?<BR>
System.in is an InputStream which is typically connected to keyboard input of console programs.

What are Keywords in Java ?<br>
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
  
  Eight Premitive Datatypes in JAVA 
  
 > Byte - 1 Byte 
  
 >Short - 2 Byte
  
  >Int - 4 Byte
  
  >Long - 8 Byte
  
  >Float - 4 Byte
  
  >Double - 8 Byte
  
  >Boolean - 1 Bit
  
  >Char - 2 Byte

**Variable:** Variable is a reserved location in a memory to store some value.<br>

  Three types of variables in JAVA

 > Instance variables are declared in a class, but outside a method, constructor or any block.

> Local variables are declared in methods, constructors, or blocks.

> Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.

**Constructor:** A constructor is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

Two types of constructors in JAVA
>No arg Constructor (Default Constructor) : A constructor with no arguments is called a default constructor. If we do not create a constructor of a class, Java creates a default constructor with data members which has values like zero, null, etc.<br>
  
>Parameterized Constructor : A constructor which has a specific number of parameters is called a parameterized constructor.<br>

What is Constructor Overloading ?<br>
Constructor overloading means having more than one constructor with the same name. Constructors are methods invoked when an object is created.

What is Expression in JAVA ? <br>
Expressions are essential building blocks of any Java program, usually created to produce a new value, although sometimes an expression simply assigns a value to a variable.
  
What is Recursion in JAVA ? <br>
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

  What is Basecase ?<br>
  The base case is a way to return without making a recursive call. In other words, it is the mechanism that stops this process of ever more recursive calls.
Java was a interpreted programming language , but after introducing JIT it was called as interpreted - compiled programming language<b>
  
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20210218150010/JDK.png" width="720" height="330">
  
![](JDK+RE+VM+IT.png)
  
 What is JDK ? Mention the variants of JDK. <br>
  JDK is a combined package of JRE and Developers tools used for designing JAVA applications. Oracle has the following variants.<br>
  1. JDK Sandard edition<br>
  2. JDK  Enterprise edition<br>
  3. JDK Micro edition<br>
  
 What is JRE ?<br>
  The JRE is the on-disk system that takes your Java code, combines it with the needed libraries, and starts the JVM to execute it. The JRE contains libraries and software needed by your Java programs to run.
  
 What is JVM ?<br>
  JVM is a virtual machine that enables the computer to run the Java program. JVM acts like a run-time engine that calls the main method present in the Java code.

  
![](Inheritance.png)<br><br>
![](MethodOverLR.png)
  
 What are the conditions for Method overriding?<br>
 1. The method name should be common and the same as it is in the parent class.
 2. The method signature (parameter list, return type) in the method must be the same as in the parent class.
 3. There must be an inheritance connection between classes.
 
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
Association in Java is a connection or relation between two separate classes that are set up through their objects.
  
 What is Aggregation ?<br>
 When an object A contains a reference to another object B or we can say Object A has a HAS-A relationship with Object B, then it is termed as Aggregation. The aggregation has a weak association between objects.	Both objects can exit independently.
  
  What is Composition ?<br>
  Composition in java is the design technique to implement has-a relationship in classes. The composition has a strong association between objects.Both objects can not exit independently.

What is JIT ?<br>
JIT is an abbriviation for Just-in-Time Compiler. It increases efficiency of the interpreter by compiling the bytecode into native machine code at runtime.
  
   Advantages of JIT compiler : <br>
  1. The JIT compiler requires less memory usage <br>
  2. Code optimization can be done while the code is running.<br>
  3. It reduces the page faults.<br>
  4. It uses different levels of optimization.
  5. JIT increase the speed of program execution.


What is ClassLoader ?<br>
A classloader in Java is a subsystem of JVM, dedicated to load class files when a program is executed, Classloader is the first one to load the executable file. There are three built-in classloaders in Java.<br>

>1. Bootstrap ClassLoader: This is the first classloader which is the superclass of Extension classloader. It loads the rt.jar file which contains all class files of Java Standard Edition.<br>

>2. Extension Classloader: This is the child classloader of Bootstrap and parent classloader of System classloader. It loads the jar files located inside $JAVA_HOME/jre/lib/ext directory.<br>

>3. System classloader: This is the child classloader of Extension classloader. It loads the class files from the classpath. By default, the classpath is set to the current directory. 

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

What is Interface in Java ?<br>
  An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.<br>
 *An interface is a completely "abstract class" that is used to group related methods with empty bodies*
  
 Why do we use Interface in Java?<br>
  --> It's used to achieve total abstraction.
  --> Since java does not support multiple inheritance in case of class, by using Interface we can achieve it.
  --> It's also used to achieve loose coupling.
  --> It's used to implement abstraction.
  
What is Marker Interface ?<br>
An empty interface in Java is referred as a Marker interface. Serializable and Cloneable are some popular ex. of Marker Interface. It provides run-time type information about objects,
  
  What is Functional Interface ?<br>
  An interface that contains only one abstract method is known as functional interface. It can have any number of default and static methods.<br>
  
  Following are the functional interface instroduced in the Java8<br>
  1. Function<br>
  2. Predicate<br>
  3. Consumer<br>
  4. Supplier<br>

 What is the difference between Interface and Abstract class ?<br>
  the main difference between an interface and an abstract class is that an interface cannot have state, whereas the abstract class can have state with instance variables.
  
What is Package in Java?<br>
Package is a collective bundle of classes and interfaces along with the necessary libraries and JAR files.<br>

Advantages of package
>Reusability<br>
>Name conflicts<br>
>Controlled acccess<br>
>Data encapsulation<br>
>Maintenance

What is Object Cloning ?<br>
An ability to create an object completely similar to an existing object is known as Object Cloning. 
 
 What is the difference between Shallow copy and Deep copy?<br>
  In Shallow copy, a copy of the original object is stored and only the reference address is finally copied. In Deep copy, the copy of the original object and the repetitive copies both are stored.
  
  What is Shallow copy?<br>
  Creating a new reference that points to the same memory location. This is also called a Shallow copy.
  
  What is Deep copy?<br>
   Creating a copy of object in a different memory location. This is called a Deep copy.

What is Wrapper classes in Java ?<br>
In Java when you declare primitive datatype then Wrapper classes are responsible for converting them into objects.
  
Why pointers are not used in Java ?<br>
1. They are unsafe<br>
2. They increase the complexity of program. <br>
3. JVM takes care of memory management implicitly. So we can not use pointers in Java.

Differentiate between Instance and Local variable.<br>
Instance variables are declared inside a class and the scope is limited to only a specific object. Local variable can be anywhere inside a method or a specific block of code. Also the scope is limited to the block of code where the variable is declared. 
  
What is String Pool ?<br>
A collection of strings in Java's Heap memory is referred as Java String pool. 

What is Execption in Java ?<br>
An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program.
  
 What is Exception Handling in Java ?<br>
 Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc. Exception is an unwanted or unexpected event, which occurs during the execution of a program. There are mainly two types of exceptions in Java as follows:<br>

![image](https://user-images.githubusercontent.com/72852725/202528741-e4c5a368-f051-4a46-8386-1d981af531e1.png)

>Checked exception: Checked exceptions are also known as compile-time exceptions as these exceptions are checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not. If not, then the system displays a compilation error. For example, SQLException, IOException, InvocationTargetException, and ClassNotFoundException.

>Unchecked exception: The unchecked exceptions are those exceptions that occur during the execution of the program. Hence they are also referred to as Runtime exceptions. These exceptions are generally ignored during the compilation process. They are not checked while compiling the program. For example, programming bugs like logical errors, and using incorrect APIs. Ex. ArithmeticException, NullPointerException, NumberFormatEception.
  
  ![image](https://user-images.githubusercontent.com/72852725/202480314-74303b45-1dbd-40de-b701-56f6175f3fb5.png)


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
The daemon thread can be defined as a thread with least priority. This Daemon thread is designed at runtime in the background during the process of Garbage collection. 
  
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
  
  What is Lambada Expression ?<br>
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

Why string is immutable in Java ?<br>
String pool requires string to be immutable otherwise shared reference can be changed from anywhere. and other reason havong string immutable allows you to be secure and safe because no one can change reference of string once it gets created. 
  
What is Method hiding ?<br>
if a subclass defines a static method with the same signature as a static method in the super class, in such a case, the method in the subclass hides the one in the superclass. The mechanism is known as method hiding.
  
 What is the difference between Method hiding and Overriding ?<br>
 In Method Overriding child class can access parent class method implementation. In case of Method Hiding parent class method implementation cannot be accessed through child class reference.
  
What is Singleton class ?<br>
A singleton class is a class that can have only one object at a time. 

Why we can say that Java is Plateform independent language ? <br>
 Java is a platform-independent programming language. Java doesn’t require the entire code to be rewritten for all the different platforms. It supports platform independence using Java bytecode and Java Virtual Machine. Java compiler javac converts the program code into byte code. This byte code is platform-independent and can run on any JVM operating system. JVM interprets the byte code to machine code, and the program is executed.

  What is the difference between Heap memory and Stack memory ?<br>
  Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution. Whenever an object is created, it's always stored in the Heap space and stack memory contains the reference to it.

  What is the Difference between "=" and "==" operator?<br>
  The “=” is an assignment operator is used to assign the value on the right to the variable on the left. The '==' operator checks whether the two given operands are equal or not. If so, it returns true. Otherwise it returns false.
  
  What is the difference between == and .equals()?<br>
  In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.<br>
  _== method used with premitive types of variables like Short, Int, Bool, Float, Double, Long while .equals method used with reference type of variables like String, Objects' _

  What is constant in Java?<br>
  A constant is a variable whose value cannot change once it has been assigned. Java doesn't have built-in support for constants.
  
  How to create constant in Java ?<br>
  In java there is no const keyword like C++ for declaring constant variable but we can use Final keyword for declaring constant in Java. 

  Can we declare a Class, Method and Variable as a constant in Java ?<br>
  Yes we can do it by using a Final keyword. but after declaring it as a constant we can not override method, we can not inherit class and we can not change the value of variable if it's a constant.

 What is the difference between Break and Continue statements ?<br>
The break and continue statements are the part of transfer statements in Java. The break statement terminates the whole iteration of a loop whereas continue skips the current iteration. The break statement terminates the whole loop early whereas the continue brings the next iteration early.
  
  What are the main Key difference between C++ and Java ?<br>
>C++ uses only compiler, whereas Java uses compiler and interpreter both.
  
>C++ supports both operator overloading & method overloading whereas Java only supports method overloading.
  
>C++ supports manual object management with the help of new and delete keywords whereas Java has built-in automatic garbage collection.
  
>C++ supports structures whereas Java doesn’t supports structures
  
>C++ supports unions while Java doesn’t support unions.

What is the difference between Final, Finally and Finalize ?<br>
  >final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.	<br>
  
  >finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.	<br>
  
  >finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.

  What is Type casting in Java ?<br>
  Type casting is a method or process that converts a data type into another data type in both ways manually and automatically. The automatic conversion is done by the compiler and manual conversion performed by the programmer. Two types of Type casting in java
 > Implicit type casting: Converting a *lower data type into a higher one* is called widening type casting. It is also known as implicit conversion. It done automatically.<br>

  Ex. byte -> short -> char -> int -> long -> float -> double
  
 > Explicit type casting: Converting a *higher data type into a lower one* is called narrowing type casting. It is also known as explicit conversion.<br>
  
  Ex. double -> float -> long -> int -> char -> short -> byte

  
Can we Overload a main() method in Java?<br>
Yes, We can overload the main method in java but JVM only calls the original main method, it will never call our overloaded main method.
  
Can we Override a Static method in Java?<br>
  No, we cannot override static methods in Java because static methods are bounded at compile time using static binding. 

  What is the difference between Assignment and Initialization?<br>
Assignment gives a variable a value at some point after the variable is created so it's called assignment while Initialization gives a variable an initial value at the point when it is created. 
  
  What is a Byte code ?<br>
  Bytecode is computer object code that an interpreter converts into binary machine code so it can be read by a computer's hardware processor.

  Can we execute a java program without main method ?<br>
  Yes, we can execute a java program without a main method by using a static block. Static block in Java is a group of statements that gets executed only once when the class is loaded into the memory by Java ClassLoader, It is also known as a static initialization block.
  
  What is Jagged array in Java ?<br>
  Jagged array is a multidimensional array where member arrays are of different size.

  What are literals in Java?<br>
  Literals in Java refere to the data that is given in a variable or constant. Five types of Literals in Java<br>
  >String literals: Sequence of characters enclosed in double quotes<br>
  >Inegral and Float literals: Integer and foat numbers<br>
  >Booleam literals: Represent True or False<br>
  >Char literals: Character value enclosed in single quotes<br>

  What is meant by Java is plateform independent?<br>
  Java is platform-independent because it uses a virtual machine. The Java programming language and all APIs are compiled into bytecodes. Bytecodes are effectively platform-independent. The virtual machine takes care of the differences between the bytecodes for the different platforms.  
  
  Bydefault classes in Java are public or private?<br>
  By default all the classes in Java are public that's why we put Public keyword in beginning of classes.

  What if the main method is declared as Private?<br>
 Pogram will not execute. It searches for the main method which is public, static, with return type void, and a String array as an argument. If such a method is not found, a run time error is generated.

  What is Increment and Decrement operators ?<br>
  Increment and decrement operators are unary operators that add or subtract one, to or from their operand, respectively.

  What is Object oriented programming ?<br>
  Object oriented programming is a methodology to design a program using Classes and Objects.
  
  What is Upcasting ? <br>
  Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object.
  
  What is Downcasting ?<br>
  Downcasting means the typecasting of a parent object is typecasted to a child object. Downcasting cannot be implicit.

  What is Loose coupling?<br>
  Loose coupling in Java means that the classes are independent of each other.
  
  What is Operator Overriding?<br>
  Operator Overriding a procedure where you can define an operator in both parent and child classes with the same signature, but with different operational capability.

What is Factory method?<br>
A factory method is a method that returns the instance of the class.

 What is Autoboxing?<br>
  The automatic conversion of **primitive data type into its corresponding wrapper class** is known as autoboxing.
  
  What is Unboxing?<br>
  The automatic conversion of **wrapper type into its corresponding primitive type** is known as unboxing. It is the reverse process of autoboxing.

  What is Covarient return type?<br>
  The covariant return types are newly introduced since Java 5.0, and used during method overriding. Covariant return type allows us to change the return type of the overriding method in the subclass;

  What is JDB ?<br>
  The Java Debugger (JDB) is a command-line java debugger that debugs the java class. It's used to find and fix bugs in the Java programs. 

  What is Diamond problem in Java?<br>
  The "diamond problem" is an ambiguity that arises when two classes B and C inherit from A, and class D inherits from both B and C. The diamond problem in Java is the main reason java doesn't support multiple inheritances in classes.

  What Are Command Line Arguments?<br>
The command-line arguments are passed to the program at run-time. Passing command-line arguments in a Java program is quite easy. They are stored as strings in the String array passed to the args parameter of main() method in Java.

What is Stack overflow error?<br>
A stack overflow is a type of buffer overflow error that occurs when a Java program tries to use more memory space in the call stack than has been allocated to that stack. 
  
 What is For loop in java?<br>
  The Java for loop is a control flow statement that iterates a part of the programs multiple times with a specified condition.
  
  What is For-each loop?<br>
  In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

  What is Covariant return type?<br>
  Covariant return type refers to return type of an overriding method. It allows to narrow down return type of an overridden method without any need to cast the type or check the return type. 
  
  What is Instance initializer block?<br>
  Instance Initialization Blocks or IIBs are used to initialize instance variables. So firstly, the constructor is invoked and the java compiler copies the instance initializer block in the constructor after the first statement super(). They run each time when the object of the class is created. 

  What is Throw keyword in Java?<br>
  The throw keyword in Java is used for explicitly throwing a single exception. This can be from within a method or any block of code. Both checked and unchecked exceptions can be thrown using the throw keyword.
  
  What is throws keyword in java?<br>
  The throws keyword in Java is used to declare exceptions that can occur during the execution of a program. For any method that can throw exceptions, it is mandatory to use the throws keyword to list the exceptions that can be thrown.
  
 What is Unreachable catch block error?<br>
 When we are using multiple catch blocks for a single try block, the order of exceptions in the catch block must be placed in such a way that first, subclass exception comes and later on superclass exception. If we place superclass exception first and later on subclass exception, all the exceptions thrown for subclass exception will be caught by the first catch block. In this case, the second catch block will not be used in the program and java compiler will generate unreachable catch block error.
  
  What is Multi catch block in java ?<br>
  When statements in a single try block generate multiple exceptions, we require multiple catch blocks to handle different types of exceptions. This mechanism is called multi-catch block in java.

  What is IOException in Java?<br>
  Java IOExceptions are Input/Output exceptions (I/O), and they occur whenever an input or output operation is failed or interpreted. For example, if you are trying to read in a file that does not exist, Java would throw an I/O exception.

What is Interpreter ?<br>
Interpreter in Java is a computer program that converts high-level program statement into Assembly Level Language.  It is designed to read the input source program and then translate the source program instruction by instruction.
