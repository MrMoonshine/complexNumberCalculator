//~/Documents/Scala/scala-2.13.0/scala-2.13.0/bin/scalac *.scala
//~/Documents/Scala/scala-2.13.0/scala-2.13.0/bin/scala main 

//Code Example for the Package
import complexNumbs._

object main{
    def printCompNumb(a_i:complex){
        val Pi = 3.14159; 

        println("Z = " + a_i.a +" + "+ a_i.b+"j");
        println("Z = " + a_i.z +" /_ "+ ((180/Pi)*a_i.phi) +" °");
        println(" ");
    }

    def main(args: Array[String]):Unit ={
        println("Test Complex Calculator!");
        var a = new complex(1,1);
        var b = new complex(3,4);
        var c:complex = complexCalc.complexFromPolar(5,1.5);
        
        a = complexCalc.conjugate(a);
        printCompNumb(a);

        a = complexCalc.multiply(b,c);
        printCompNumb(a);

        a = complexCalc.divide(b,c);
        printCompNumb(a);

        a = complexCalc.add(b,c);
        printCompNumb(a);

        a = complexCalc.substract(b,c);
        printCompNumb(a);
    }
}