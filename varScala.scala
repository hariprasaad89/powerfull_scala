package main

object varScala {
def main(args:Array[String]) = {
    
   //Immutable
     val a:Int = 5
     println("Immutable Variables is " +a)
   //Mutable
     var b:Int = 6
     println("Mutable Variables is " +b)
     
   // trying to change the valuea
 //   a = a +5
     b= b+5
     println(" now the value of b is " +b)
    
     // Lazy intialization
     lazy val name:String = "Hari"
     println(" Name is " +name)
     
     val x = { println ("foo") ; 10 }
     println ("bar")
     println (x)
     
    lazy val y = { println ("foo") ; 10 }
    println ("bar")
    println (y)
 


}
}