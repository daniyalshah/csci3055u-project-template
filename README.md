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

### Refer to the Basic Syntax folder to learn more about syntax, such as Loops, IF Statements, Arrays and more!
#### Now that we have gotten the basic syntax down, let's learn more about the tools.

## About the tools

### Scala Webframes. 
These are tools being used all around web applications, Some include:
* The **Lift** Framework
* The **Play** Framework
* The **Bowler** Framework 

All of these are great tools for starting developers looking to expand their knowledge and have a great base to start with. You can get more done in less time. You'll get to build what you want rapidly, without having to spend time building or worrying too much about the infrastructure items listed above.

### Tools for Installing Scala Without an IDE
Scala can be installed on any LINUX or Windows System with one condition, that is to have a Java version of 1.5 or greater, which mostly every computer being used right now does.
As mentioned before, Scala uses JVM and just to make sure you have version 1.5 above, run the following prompt
```scala
C:\>java -version
```
If you're good with the version, download Scala from right [here](http://www.scala-lang.org/downloads). download the latest .jar and put it in C:/> directory. If you're not happy with the version you have, download the latest version from [here](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
After all is set and you've gotten the scala jar file -> run the prompt 
```scala
C:\>java -jar scala-0.0.0.0-installer.jar
```
After, an installation wizard would pop up, follow it, select a path, hit confirm.
To check the version of Scala you have, run the prompt 
```scala
C:\>scala -version
```
#### Boom, you are ready to code in Scala!
 
#### Tools for installing Scala with an IDE
If you like it simple and have an IDE like Intellij, you just need to install a simple plugin called "Scala Plugin" and then start coding in scala!

## About the standard library

### The base scala collection library
contains alot of usefull core type functions & data structures such as:

* **Array:** function
* **Strings:** function
* **Sets:** function
* **Vector:** data structure
* **TreeMap:** data structure
* **HashMap:** data structure

These are all available in scala standard library without explicitly importing specific libraries. Although Scala packages can be imported so that they can be referenced in the current compilation scope.

### For example, 
let's import the contents of the scala.xml package:
```scala
import scala.xml._
```
You can import more than one class or object from a single package, for example, TreeMap and TreeSet from the scala.collection.immutable package:

```scala
import scala.collection.immutable.{TreeMap, TreeSet}
```
### Real World Example 
In this example, it takes contents from a txt file, and quick sorts them! by importing ```scala.util.Sorting```

```scala
import scala.util.Sorting
object Sorting {
  
  def main(args: Array[String]) {
    println( solution )
  }
  
  def solution =
  {
    val lines = io.Source.fromFile(dataPath).getLines() toArray
    val values = (lines(0) split ",") map ( s => s.substring(1,s.length-1) )
    Sorting.quickSort(values)
    def nameToValue( s:String ) = { s map (_.toInt - 'A' + 1) reduceLeft(_+_) }
    (values map ( nameToValue(_) ) zipWithIndex)
       .map( i => ((i._2+1) * i._1).toLong )
       .reduceLeft( _+_ )
  }
  val dataPath = "/home/testingforScala/textfileexample.txt"
} 
```
## More Examples!

#### Check out the "Real App Folder" where I implement a "Real" Scala program which reads JSON files using the standard libraries
#### The standard library folder also has another example which shows a specific Data Structure; Binary Search Tree

## About open source library

### Breeze

A community based library for Scala with over 3400 commits and almost 100 contributors. Breeze focuses on data science (just like you Dr Pu). This library takes ideas from MATHLAB's data structure and the NumPy Classes for Python. Breeze works fast and efficiently with manipulations data arrays, and includes many other useful operations such as:

* **Matrix and vector operations**: for creating, transposing, filling with numbers, conducting element-wise operations, inversion, calculating determinants, and much more other options to meet almost every need.

* **Probability and statistic functions**: From statistical distributions and calculating descriptive statistics (such as mean, variance and standard deviation) to Markov chain models. The primary packages for statistics are:
```breeze.stats``` & ```breeze.stats.distributions```

* **Optimization**: Implies investigation of the function for a local or global minimum. Optimization methods are stored in the ```breeze.optimize``` package. 
* **Linear algebra**: All basic operations rely on the netlib-java library, making Breeze extremely fast for algebraic computations.
* **Signal processing operations**: Necessary for work with digital signals. Operations, which decomposes the given function into a sum of sine and cosine components.

To use Breeze or to find more information on it, go [here to breez's github page](https://github.com/scalanlp/breeze)

Also, Here's a simple example using Breeze to create a csv file and populate them with binary vectors
```scala
import java.io.File
import breeze.linalg._

val file = new File("./data/binary.csv")
val mat = csvread(file, skipLines = 1)
val X = DenseMatrix.horzcat[DenseMatrix[Double], Double](DenseMatrix.ones[Double](mat(::, 1 to 3).rows, 1), mat(::, 1 to 3))
val y = mat(::, 0)

def u(w: DenseVector[Double]): DenseVector[Double] = X(*, ::).map(x =>  1/(1 + Math.exp(-(w dot x))))
def S(w: DenseVector[Double]) = diag(u(w).map(e => e * (1.0 - e)))
def step(Sk: DenseMatrix[Double], uk: DenseVector[Double], wk: DenseVector[Double]): DenseVector[Double] =
  inv(X.t * Sk * X) * X.t * (Sk * X * wk + y - uk)

def Pr(y: Int, x: DenseVector[Double], w: DenseVector[Double]) = {
  def h(x: DenseVector[Double], w: DenseVector[Double]) = 1/(1 + Math.exp(-(w dot x)))
  y match {
    case 0 =>
      1 - h(x, w)
    case 1 =>
      h(x, w)
  }
}
def likelyhood(w: DenseVector[Double]) = (0 until X.rows).map(i =>
  Pr(if(y(i) > 0.0) 1 else 0, X(i, ::).t, w)
).foldLeft(1.0)((s, p) => s * p)

var w = DenseVector(0.0, 0.0, 0.0, 0.0)
var wNext = step(S(w), u(w), w)
val tolerance = 0.0001
var counter = 0

while(norm(w - wNext) > tolerance && counter < 100){
  w = wNext
  wNext = step(S(w), u(w), w)
  while(likelyhood(w) > likelyhood(wNext)){
    wNext = w + ((w - wNext) /:/ 2.0)
  }
  counter += 1
}
s"counter = $counter, likelyhood(w) = ${likelyhood(w)}"
w
```

# Analysis of the language


## Procedure vs Functional in Scala
In Scala, you have the option to use **Procedure** style syntax, and **Functional** (If you force yourself too). It enables both, but let's go into furthur detail.

### Procedural programming in Scala
The defination of procedural programming according to google is: *“Procedural programming is a programming paradigm, derived from structured programming, based upon the concept of the procedure call. Procedures, also known as routines, subroutines, or functions (not to be confused with mathematical functions, but similar to those used in functional programming), simply contain a series of computational steps to be carried out.”*. 

Well this defination definatly sounds like coding in Scala! The procedure syntax compiles to a method that returns. Scala enables this, let's see an example.

```scala
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}
```
Look familiar? 

### Functional programming in Scala
The defination of Functional programming according to google is: *"Functional programming is a programming paradigm with roots in lambda calculus and function abstraction which treats computation as the evaluation of mathematical functions. It avoids changing state and mutable data which avoids programming side effects while reinforcing stability and predictability."*.

Learning to think and program within the functional paradigm requires a change in the mind-set of the programmer. This is possible in scala, but not without a set of rules that one must follow. A user who goes by *Impredicative* on stack overflow came up with a basic set of rules to enforce functional programming on Scala, they are as follows:

* **Don't** use the var keyword.
* **Don't** use the while keyword.
* **Don't** use anything in the scala.collection.mutable package.
* **Don't** use the asInstanceOf method.
* **Don't** use null. If you ever come across null (in someone else's code), immediately wrap it in a more appropriate datatype (usually Option will do nicely).

Once you've avoided these things, you can make your code more functional by using ```fold``` when performing direct recursion or when you see destructuring operations on a data structure, consider whether instead you can lift the computation into the structure and avoid destructuring it. 

An example,
```scala
foo match {
  case Some(x) => Some(x + 2)
  case None => None
}
```
can be replaced with 
```scala
foo map ( _ + 2 )
```
## Meta-Programming in Scala
*Metaprogramming is a programming technique in which computer programs have the ability to treat programs as their data.*
This is available in Scala after update 2.10 but couldn't find much information on it, However, you can use tools such as [Scalameta](https://scalameta.org/) & [Macro paradise plugin](https://docs.scala-lang.org/overviews/macros/paradise.html).

Scalameta is a metaprogramming toolkit for Scala that allows you to parse string literals as language AST and operate with it properly. **This means that we can compose some strings and then interpolate it in real programs.** 
Macro paradise is a plugin that is making latest macro developments available in a plugin format.

After following *Arthur Kuska's* [Tutorial](https://medium.com/@Arhelmus/metaprogramming-magic-with-scalameta-67e849ab490e) 
we can come up with code that might look weird at first, but certainly process language syntax trees as regular strings & uses basic principles of metaprogramming in Scala

```scala
defn match {
  case q"def $name(...$paramss): $result = { ..$body }" =>
    val newBody = immutable.Seq(
      q"println(${"Macro hello"})"
    ) ++ body

    q"def $name(...$paramss): $result = { ..$newBody }"
  case _ =>
    abort("@Memoize must annotate an function.")
}
```
A simple example of a higher-order meta function is the compose function, which takes two functions, f and g, as input and returns the result of composing f with g:

```scala
def compose(f: Int=>Int, g: Int=>Int): Int=>Int = {
   def r(x: Int): Int = f(g(x));
   r _
}
```
## Symbol Resolution & Closures in Scala

### Symbol Resolution in Scala

Scala has support for symbol resolution, Symbol resolution runs the entire spectrum, from simple and intuitive to complex and perplexing. Most resolutions are carried out silently by the link-editor. However, some relocations can be accompanied by warning diagnostics, while others can result in a fatal error condition. The resolution of two symbols depends on their attributes, the type of file that provides the symbol, and the type of file being generated. 

### Closure in Scala

Scala has support for Closure. A closure is a function, whose return value depends on the value of one or more variables declared outside this function. An example of code can be

```scala
object Test { 
   def main(args: Array[String]) {
      println( "muliplier(1) value = " + multiplier(1) ) 
      println( "muliplier(2) value = " + multiplier(2) ) 
   }
   var factor = 3 
   val multiplier = (i:Int) => i * factor 
   }
```
This outputs 
```scala
muliplier(1) value = 3 
muliplier(2) value = 6
```
This is an example of a closure function because it references factor and reads its current value each time. If a function has no external references, then it is trivially closed over itself. No external context is required.

## Lexical vs Dynamic Scoping in Scala

The dynamic scope rule says the calling environment should be searched for non-locals, using dynamic scoping in Scala is a bad idea since programmers will have no control over how their functions will be called. Scala uses lexical or otherwise known as static scoping. 


## Functional Programming constructs in Scala

### Scala benefits from functional programming constructs such as

* Map reduce & Immutability 
* Having Pure Functions in Scala
* Higher level abstractions

### Map reduce & Immutability

```scala
val textFile = sc.textFile("hdfs://...")
val counts = textFile.flatMap(line => line.split(" "))
                 .map(word => (word, 1))
                 .reduceByKey(_ + _)
counts.saveAsTextFile("hdfs://...")
```
#### The following code performs a word count. counting how many times each word has occurred in a given dataset. 

* The output of the ```flatMap ``` would be individual words it,is,a,simple ….
* ``` map``` then takes the individual words then maps them into a key value pair (it,1),(is,1),(a,1) ….
* ```reduceByKey ``` does what it is named after. It takes the words for example (it,1) and the next (it,1) and then combines them into (it,2).

Immutable objects are thread safe considering that their content cannot be changed. Thread safety is directly related to parallelism and multi-core/multi-machine performance/scalability. If there are too many locks then they slow down the entire operation and if there are no locks then it will lead to wrong results. In scala immutability implies thread safety. Case classes are classic examples of immutable objects/classes in scala. 

#### This is one of the reason why immutability is favoured in Scala as opposed to mutable programming constructs.

### Having Pure Functions in Scala

The core of functional programming is pure functions. *In functional programming world, a pure function is one which has no side effects. It is only dependant upon the input parameter and does not mutate state elsewhere.* 

A function is considered not pure if it does one or more of the following:

* Variable mutation in current function/class or in some other class
* Printing to console of anywhere else
* Saving data to a database

In functional languages there are monads to handle I/O aswell, which Scala can do. Pure functions can be incredibly helpful in Scala, as they reduce cognitive load on code, and how no thread safety required since no mutability is involved, also pure functions don't depend on any external resource, they are always encapsulated. 

An example of a pure function could be the following:

```scala
val init = 10
  val x = math.sin(init)
  println(x)
  //init does not change
  println(init)
  ```
  #### In scala, there is only call by value & call by name making this pure.
  
  ### Higher level abstractions

```scala
import scala.collection.mutable.ListBuffer
object Runnable extends App {
  val x = List(10,20,30,40)
  val mutable = new ListBuffer[Int]
  for (e <- x) {
    mutable += (e * 3)
  }
  println(mutable.toList)
}
```
The runtime can take this piece of code and perform lot of optimizations on it when compared to a for loop and the that’s the power of higher level constructs. Therefore, high level functions can take other functions as their parameters.

Other functional programming constructs can be Dependency Injection, Lambda Calculas, Extensible language, Pattern Matching, Mutations and Composing functions. More information on functional programming constructs can be found [here](http://allaboutscala.com/tutorials/scala-introduction/scala-functional-programming-features/)

## Static vs Dynamic types in Scala

Scala is static type system, every value, parameter, and method has a type associated with it known at compile time. Also, without running the program, the compiler can tell the user if the program has errors based on the types. This handles logical user mistakes like entering a string instead of a required int. Scala's type inference is very powerful and very convenient. Users can depend on the compiler to help us during development. Scala code does not need to be annotated. If the type of some domain concept changes, that new type will tranfer to all areas where its type is left to be inferred. The compiler will automatically infer that new type without the user having to change any annotations. If the user happens to miss any spots or leave the code in an illogical state, the code wouldn’t compile, preventing any surprising runtime errors. All of this is static type system, in Scala.

## Pros and Cons of Scala

### Pros
* **Easy to understand, Read & Learn**: compared to Java, code in Scala is significantly less in the amount of lines, the reduction of lines of code matter big time when it's a huge program, so this increases productivity and a faster time-to-market!, and it is more closer to english than it is to other languages, making the average human understanding it more, and if you have a background in java, this will be fairly easy to pick up. 
* **Functional or Procedural Programming in Scala**: Scala encourages functional programming along with procedural, which ever ones type is they can choose to do. Or If you want to learn one another, that Is also easy to do so. Scala programming is also high quality resulting in less bugs while programming.
* **Improving Ecosystem**: Updates are very frequent, and support from developers is increasing.
### Cons
* **Lack in Tools**: Tools and IDE plugins are not as common as Java
* **Lack in Community made Libraries**: Not as much as java, but rapidly increasing as Scala gets more popular
* **Limited documentation**: Especially for students who don't understand or read english, not that much information out there on web. 















