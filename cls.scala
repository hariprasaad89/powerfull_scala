package main

class cls {
  
  def sum(a:Int):Int = {
    val b = a + 3
    return b
  }
 
 }

object samp {
  def main (args:Array[String]){
    val ob = new cls
    println(ob.sum(2))
  }
}