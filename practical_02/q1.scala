object question01{

    var i,j,k:Int =2
    var m,n:Int =5
    var f:Float =12.0f
    var g:Float =4.0f
    var c:Char ='X'

    def evaluateA():Int={
        k+12*m
    }

    def evaluateB():Int={
        m/j
    }

    def evaluateC():Int={
        n%j
    }

    def evaluateD():Int ={
        m/j*j
    }

    def evaluateE():Float={
        f+10*5+g
    }

    def evaluateF():Int={
        i+=1
        i*n
    }

    def main(args: Array[String]): Unit={
        println(s"a. k + 12 * m= ${evaluateA()}")   //62
        println(s"b. m / j=${evaluateB()}")   //2
        println(s"c. n % j=${evaluateC()}")   //1
        println(s"d. m/ j * j=${evaluateD()}")   //4
        println(s"e. f + 10*5 +g=${evaluateE()}")   //66.0
        println(s"f. ++i * n=${evaluateF()}")   //15
    }
}
