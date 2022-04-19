package main

object curryingFn {
 def add(a:Int,c:Int):Int=>Int =  {
   b => a+b+c
   
 }
 
  def main (args:Array[String]){
    val cfn = add(50,60)
   println ()
   println(cfn(7))
  }
}

