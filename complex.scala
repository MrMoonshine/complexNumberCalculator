package complexNumbs{
import scala.math._
//NOTICE!!!
//This Package is using Radians

    //enter Complex number in componentform
    //a is the real part and b the imaginary
class complex(a_i:Double,b_i:Double){
    var a :Double = a_i;
    var b :Double = b_i;
    var z :Double = getSum();
    var phi :Double = getPhase();
    val Pi = 3.14159; 

    //calaculates the sum of a complex num
    def getSum():Double ={
        var z_o:Double = sqrt(a*a+b*b);
        return z_o;
    }
    //calculates the phase-angle of a complex number
    def getPhase():Double={
        var phi_o :Double = 0;
        if(a == 0){
        if(b>0)
        phi_o = Pi / 2;
        else if(b<0)
        phi_o = -Pi / 2;
        }else{
        phi_o = atan(b/a);
    }
        return phi_o;
    }


}

//complex calculating operators
object complexCalc{
    def complexFromPolar(z_i:Double,phi_i:Double):complex = {
        var a_o = z_i*cos(phi_i); 
        var b_o = z_i*sin(phi_i);
        var f_o = new complex(a_o,b_o);
        return f_o;
    }

    def multiply(a_i:complex,b_i:complex):complex = { 
        var z_o = a_i.z * b_i.z;
        var phi_o = a_i.phi + b_i.phi;
        var f_o:complex = complexFromPolar(z_o,phi_o); 
        return f_o;
    }

    def divide(a_i:complex,b_i:complex):complex = { 
        var z_o = a_i.z / b_i.z;
        var phi_o = a_i.phi - b_i.phi;
        var f_o:complex = complexFromPolar(z_o,phi_o); 
        return f_o;
    }

    def add(a_i:complex,b_i:complex):complex = { 
        var a_o = a_i.a + b_i.a;
        var b_o = a_i.b + b_i.b;
        var f_o = new complex(a_o,b_o); 
        return f_o;
    }
    
    def substract(a_i:complex,b_i:complex):complex = { 
        var a_o = a_i.a - b_i.a;
        var b_o = a_i.b - b_i.b;
        var f_o = new complex(a_o,b_o); 
        return f_o;
    }

    def conjugate(a_i:complex):complex = { 
        var f_o = new complex(a_i.a,-a_i.b); 
        return f_o;
    }
}
}