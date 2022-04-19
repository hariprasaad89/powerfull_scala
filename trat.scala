package main



trait  trait1 {
  
  def add
  
  def sub
  
  def multi {
    println("multi")
  }
  
}

class child extends trait1 {
  def add {
    println("add")
  }
  
  def sub {
    println ("sub")
  }
  
  override def multi {
    println("new multi")
  }
}

object test {
  def main (args:Array[String]){
    val ob = new child
    ob.add
    ob.sub
    ob.multi
  }
}