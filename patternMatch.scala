package main

object patternMatch {
  def main(args:Array[String]){
    
    //Normal Pattern matching
    println("Pattern matching ")
    val fruits = "Orange"
    fruits match {
    case "Orange" => println("Given Fruit is orange")
    case _ => println("Unknown Fruit")
}
    // assigning to variable
    println("\nPattern matching ")
    val fruitNmae = fruits match {
    case "Orange" => "Orange"
    case _ => println("Unknown Fruit")
    
}
    println(s"fruitName is  : $fruitNmae")
  }
}