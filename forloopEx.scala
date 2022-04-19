package main

object loopEx {
  def main (args:Array[String]){
    // for loop
    for (a <- 1 to 5){
        println(s"$a")
       } 
    
    
    for (a <- 1 until 5){
        println(s"$a")
       }
    
    // with if condition
     val b = List(1,2,3,4)
     for(a <- b if a ==2){ 
     val  b = a * 5
    println(s"value is $b")
    }
     
    // with yield 
    val c = for{a <- 1 to 4  } yield a
    println(s"$c")
  }
}