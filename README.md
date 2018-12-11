# _The Scala Programming Language_

- _Syed Daniyal Shah_
- _syed.shah12@uoit.net_
- _100622173_

## Scala Overview
### What is Scala?
Scala, short for Scalable Language, is a hybrid functional programming language. It was created by Martin Odersky and it was first released in 2003. Scala Programming language has the ability to grow with the growth in the technicalities of ones program. Scala smoothly integrates features of object-oriented and functional languages and Scala is compiled to run on the Java Virtual Machine. When we consider a Scala program it can be defined as a collection of objects that communicate via invoking each others methods
### History of Scala
Martin Odersky began the initial designing of Scala in the year 2001 at the École Polytechnique Fédérale de Lausanne (EPFL). Before the development of Scala, Odersky has had an experience of working on Sun’s Java compiler, and Generic Java and javac. The language was first released internally in the year 2003. This was accompanied by the first public release of Scala in the beginning of 2004. The language was formally released on the platforms of Java, and .NET in the month of June 2004. With some better features, the 2.0 version of the language was released in March 2006. The developments in the language led towards the formal cessation of the .Net support in the year 2012.
### Where is Scala used?
Many existing companies, who depend on Java for business critical applications, are turning to Scala to boost their development productivity, applications scalability and overall reliability. A wide range of companies, such as LinkedIn, Intel, or Twitter are using Scala. Scala language consists of a very robust static system provides farfetched support for functional programming. The language is designed in a manner that makes it concise yet function. 
### Intresting and Important features of Scala 

* Scala is **object-oriented**:
Scala is a pure object-oriented language in the sense that every value is an object. Types and behavior of objects are described by classes and traits.Classes are extended by **subclassing** and a flexible **mixin-based composition** mechanism as a clean replacement for multiple inheritance.
* Scala is **functional**:
Scala is also a functional language in the sense that every function is a value and because every value is an object so ultimately every function is an object.
* Scala is **statically** typed:
Scala, unlike some of the other statically typed languages, does not expect you to provide redundant type information. Scala doesn't require the user to specify a type in most cases, and the user doesn't have to repeat it.
* Scala runs on the **JVM**:
Scala is compiled into Java Byte Code, which is executed by the Java Virtual Machine (JVM). This means that Scala and Java have a common run-time platform. You can easily move from Java to Scala.
* Scala can execute java code:
Scala enables you to use all the classes of the Java SDK's

### Why should you use Scala?
Because it's awesome, easy and simple! You can turn 3 lines of java code into just one with scala

## About the syntax

If you're familiar with Java, Scala should be pretty simple to pick up!
The biggest syntactic difference between Scala and Java is that the ; line end character is optional.

After installing the Scala jar, in the prompt type in "scala -version" and press enter
Now you are ready to code!

Lets now learn basic syntax! 
* **Object**: Objects have states and behaviors.
* **Class**: A class can be defined as a template/blueprint that describes the behaviors/states that object of its type support.
    * **Class Name**: For all class names, the first letter should be in Upper Case.
* **Methods**: A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
    * **Method Name**: Unlike class names, method names should start with a lower case letter
* **Fields**: Each object has its unique set of instant variables, which are called fields. An object's state is created by the values assigned to these fields.
* **Case Sensitivity**: Scala is case-sensitive, which means identifier how and How would have different meaning in Scala.
* **File Name**: The program file name should exacctly match the object name, when saving a file, save it using the object name and remember that scala is case sensistive, so be careful! 
* **Processing of main()**: a main() method is required in every scala program because just like java, the processing starts there.

### Data types:
If you're not familiar with Java data types, you can find a whole list [here](https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html) 

### Lets learn with code!

### Comments & Simple Hello World Printer by Objects
Scala supports single line & multi line comments. This object also prints the statement "Hello, world!"

```scala
object HelloWorld { 
   /* First example woo. 
   * This will print 'Hello World' as the output 
   * Also a multi line comment. 
   */ 
   def main(args: Array[String]) 
   { // Prints Hello World 
     // Single line comment. 
     println("Hello, world!") 
    } 
}
```
### Newline Characters & Variable Declaration:
Scala is a line-oriented language where statements may be terminated by semicolons (;) or newlines.
Here we also declare a variable named "s" as a string & then proceed to print it.

```scala
var s : String = "hello"; println(s)
//this is the same as
val s : String = "hello"
println(s)
```
You can see above, we first used "var" to define a varible, and then we used "val"
* Var: This means that it is a variable that can change value and this is called mutable variable.
* Val: This means that it is a variable that can not be changed and this is called immutable variable.

Also to note, **variables** in Scala can have three different scopes depending on the place where they are being used. They can exist as **fields**, as **method parameters** and as **local variables**

### Scala Operators 

Different types of operators can also be used in Scala,
for example:
* "+" = add
* "-" = subtracts
* "*" = multiplies
* "/" = divides
* "%" = remainder

Let's include these in some code!

```scala
object Test {
   def main(args: Array[String]) {
   var a = 10; 
   var b = 20; 
   var c = 25; 
   var d = 25; 
   println("a + b = " + (a + b) ); 
   println("a - b = " + (a - b) ); 
   println("a * b = " + (a * b) ); 
   println("b / a = " + (b / a) ); 
   println("b % a = " + (b % a) ); 
   println("c % a = " + (c % a) );
  }
}
```
The following code would ouput
```scala
a + b = 30 
a - b = -10 
a * b = 200 
b / a = 2 
b % a = 0 
c % a = 5
```
You can also include certain relational operators: ==, !=, >, <, >=, <=
Basically all the ones you have learnt from class!
Same goes for Logical Operators, Bitwise Operators & Assignment Operators

### Functions
functions are group of statements that come together and perform a task! Well, you might be confusing this with **"Methods"**. You can use the terms interchangeably but just remember, A Scala method is a part of a class which has a name, a signature, optionally some annotations, and some bytecode where as a function in Scala is a complete object which can be assigned to a variable.

A Function has the following form:
```scala
def functionName ([list of parameters]) : [return type] = { 
   function body 
   return [expr] 
   }
// Very similar to Java, a return statement can be used along with an expression in case function returns a value.
// Following is a function which adds up two intergers, and displays their sum 
object add{ 
   def addInt( a:Int, b:Int ) : Int = { 
      var sum:Int = 0
      sum = a + b
```
### Classes & Objects
A class is a blueprint for objects. Once you define a class, you can create objects from the class blueprint with the keyword new. Following is a simple syntax to define a class in Scala:

```scala 
import java.io._ 
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc 
   var y: Int = yc 
   def move(dx: Int, dy: Int) { 
      x = x + dx 
      y = y + dy 
      println ("Point x location : " + x); 
      println ("Point y location : " + y); 
      } 
} 

object Test { 
   def main(args: Array[String]) {
       val pt = new Point(10, 20); 
       pt.move(10, 10);
    }
}

//When the  above code is compiled it prints "Point x location : 20" & "Point y location : 30"
```
The class name works as a class constructor, which can take a number of parameters. The above code defines two constructor arguments, xc and yc; they are both visible in the whole body of the class.

#### Now that we have gotten the basic syntax down, let's learn more about the tools.

## About the tools

### Scala Webframes. 
These are tools being used all around web applications, Some include:
* The Lift Framework
* The Play Framework
* The Bowler Framework 

All of these are great tools for starting developers looking to expand their knowledge and have a great base to start with. You can get more done in less time. You'll get to build what you want rapidly, without having to spend time building or worrying too much about the infrastructure items listed above.

### Tools for Installing Scala Without an IDE
Scala can be installed on any LINUX or Windows System with one condition, that is to have a Java version of 1.5 or greater, which mostly every computer being used right now does.
As mentioned before, Scala uses JVM and just to make sure you have version 1.5 above, run the following prompt
```
C:\>java -version
```
If you're good with the version, download Scala from right [here](http://www.scala-lang.org/downloads). download the latest .jar and put it in C:/> directory. If you're not happy with the version you have, download the latest version from [here](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
After all is set and you've gotten the scala jar file -> run the prompt 
```
C:\>java -jar scala-0.0.0.0-installer.jar
```
After, an installation wizard would pop up, follow it, select a path, hit confirm.
To check the version of Scala you have, run the prompt 
```
C:\>scala -version
```
Boom, you are ready to code in Scala!
 
### Tools for installing Scala with an IDE
If you like it simple and have an IDE like Intellij, you just need to install a simple plugin called "Scala Plugin" and then start coding in scala!

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


