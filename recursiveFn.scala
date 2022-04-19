package main

object recursiveFn {
  
  //rec fn
  def fact(a:BigInt):BigInt = {
   if (a<2)
     1
   else
     
    a*fact(a-1)
   }


 
 def main (args:Array[String]){
   println(fact(3))
    
  }
}