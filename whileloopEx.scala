package main

object whileloopEx {
  def main(args:Array[String]){
    // while loop
  println(" How to use while loop in Scala")
   var a = 1
  while (a < 11 ) {
  println(s"number = $a")
 a +=2
  }
  
  // do while
  println("\n How to use do while loop in Scala")
  var number = 1
 do {
   number += 2
    println(s"number = $number")
    } while (number < 11)
  }
}