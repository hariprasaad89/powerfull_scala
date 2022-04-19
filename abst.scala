package main

abstract class  abst {
  
  def add
  
  def sub
  
   
}

abstract class abs2 {
  
  def multi {
    println("multi")
  }
}

class abschild extends abst  {
  def add {
    println("add")
  }
  
  def sub {
    println ("sub")
  }
  
   def multi {
    println("new multi")
  }
}

object test1 {
  def main (args:Array[String]){
    val ob = new abschild
    ob.add
    ob.multi
  }
}