// Java: Runs on the Java Virtual Machine (JVM), which allows it to run on almost any platform with a JVM implementation.
// Scala: Primarily runs on the JVM, but can also target the .NET Common Language Runtime (CLR) with additional tooling.

// Java: Primarily object-oriented.
// Scala: Object-oriented and functional. Scala supports object-oriented programming like Java, but also allows for functional programming, which treats computation as the evaluation of functions.

// Java: Statically typed, meaning variable types must be declared before they are used. 
// Scala: Statically typed, but with type inference. The compiler can often infer the type of a variable from the way it is used, reducing the need for explicit type declarations.

// Java: Generally considered more verbose, requiring more lines of code to achieve the same results compared to Scala.
// Scala: More concise, often allowing you to express complex ideas in fewer lines of code.

// Java: Widely used in enterprise applications, web development, and Android development due to its maturity, large developer community, and vast ecosystem of libraries and frameworks.
// Scala: Popular in big data, machine learning, and functional programming due to its powerful features for these domains.


object question02{

    var a:Int = 2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5
    var k:Float = 4.3f

    def evaluateA():Int={
        b*a+c*d
    }

    def evaluateB():Int={
        val result = a
        a += 1
        result
    }

    def evaluateC():Float={
        val g:Float=1.0
        -2*(g-k)+c
    }

    def evaluateD():Int={
        c=c+1
        c
    }

    def evaluateE(): Int = {
        c += 1
        val result = c * a
        a += 1
        c = result
        c
    }

    def main(args: Array[String]): Unit = {
        println(s"a) ${evaluateA()}")
        println(s"b) ${evaluateB()}")
        println(s"c) ${evaluateC()}")
        println(s"d) ${evaluateD()}")
        println(s"e) ${evaluateE()}")
    }
}