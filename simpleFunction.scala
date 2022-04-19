package main

object simpleFunction  {
  
   def add(a: Int, b: Int):Int =  {
				          val c = a + b
				           return c
				           }
  def main (args:Array[String]){
  println(simpleFunction.add(1,2))
 }
}