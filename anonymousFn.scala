package main

object anonymousFn {
  
  //oridinary function
  def multi(a:Int):Int = {
   a*a
   }
 // lambda functions
  val mul = (a:Int) => a*a

 
 def main (args:Array[String]){
   println(multi(12))
    println(mul(12))
 }
}