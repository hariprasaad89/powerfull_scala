package main

object ifEls {
  def main (args:Array[String]){
    val a = 20
    

if(a > 100){
  println(s"a is larger  = $a")
}
    else
  println(s"a is not larger = $a")
 
  
  
val n = if(a > 10) (2 * 3) else false
println(s"Number  = $n")
}
   }